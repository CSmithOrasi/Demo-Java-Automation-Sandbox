package com.trainingserver.rest.objects;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import com.orasi.utils.TestReporter;

public class RestObject {
    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass() || obj == null) {
            return false;
        }

        Method[] methods = Arrays.stream(this.getClass().getMethods()).filter(x -> x.getName().contains("get")).toArray(Method[]::new);

        for (Method method : methods) {
            try {
                if (method.getReturnType().isArray()) {
                    TestReporter.logTrace("Handling an array attribute.");
                    Object[] thisArray = (Object[]) method.invoke(this);
                    Object[] objArray = (Object[]) method.invoke(obj);

                    if (thisArray == null && objArray == null) {
                        continue;
                    }
                    if (thisArray == null || objArray == null) {
                        return false;
                    }
                    if (thisArray.length != objArray.length) {
                        return false;
                    }
                    if (thisArray.length == 0 && objArray.length == 0) {
                        continue;
                    }
                    for (int i = 0; i < thisArray.length; i++) {
                        if (!thisArray[i].equals(objArray[i])) {
                            TestReporter.logTrace(thisArray[i] + " " + objArray[i]);
                            return false;
                        }
                    }
                } else {
                    Object thisVal = method.invoke(this);
                    Object objVal = method.invoke(obj);

                    if (thisVal == null && objVal == null) {
                        continue;
                    }
                    if (thisVal == null || objVal == null) {
                        return false;
                    }
                    if (!thisVal.equals(objVal)) {
                        return false;
                    }
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return true;
    }
}
