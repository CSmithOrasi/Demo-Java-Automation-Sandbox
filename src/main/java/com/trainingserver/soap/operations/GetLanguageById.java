package com.trainingserver.soap.operations;

public class GetLanguageById extends OperationsTemplate {
    public GetLanguageById() {
        this.setLink("getLanguageById");
        this.setup();
    }

    public void setLanguageId(String languageId) {
        setRequestNodeValueByXPath("/Envelope/Body/getLanguageByIdRequest/languageId", languageId);
    }

}