package com.Reqres;

import com.Reqres.Register.Register;

public class RestReqres {
    public static final String baseURL = "https://reqres.in";

    public static Register register() {
        return new Register();
    }
}
