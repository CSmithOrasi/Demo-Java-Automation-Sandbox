package com.Reqres.Register;

import com.Reqres.RestReqres;
import com.Reqres.Register.Object.Request;
import com.orasi.api.restServices.RestResponse;
import com.orasi.api.restServices.RestService;
import com.orasi.api.restServices.Headers.HeaderType;

public class Register {
    private RestService restService = new RestService();
    private String path = RestReqres.baseURL + "/api/register";

    public RestResponse createRegister(Request request) {
        return restService.sendPostRequest(path, HeaderType.JSON, RestService.getJsonFromObject(request));
    }
}
