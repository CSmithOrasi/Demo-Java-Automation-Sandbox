package com.Reqres.Register;

import org.testng.annotations.Test;

import com.Reqres.RestReqres;
import com.Reqres.Register.Object.Request;
import com.Reqres.Register.Object.Response;
import com.orasi.api.restServices.RestResponse;
import com.orasi.utils.TestReporter;

public class TestRegister {
    @Test
    public void testRegister() {
        String email = "Sydney@fife";
        String password = "pistol";

        Request request = new Request();
        request.setEmail(email);
        request.setPassword(password);

        RestResponse response = RestReqres.register().createRegister(request);
        Response data = response.mapJSONToObject(Response.class);

        System.out.println(response.getResponse());

        TestReporter.assertTrue(data.getToken().equals("QpwL5tke4Pnpja7X"), "Validating the token ID");
    }
}
