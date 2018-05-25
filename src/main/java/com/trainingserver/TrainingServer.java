package com.trainingserver;

import com.orasi.api.soapServices.SoapService;

public class TrainingServer extends SoapService {

    public TrainingServer() {
        setServiceName("TrainingServer");
        setServiceURL("https://training-server.herokuapp.com/soap/operations.wsdl");
    }
}
