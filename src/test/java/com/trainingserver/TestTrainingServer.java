package com.trainingserver;

import org.testng.annotations.Test;

import com.orasi.utils.Constants;
import com.orasi.utils.TestReporter;
import com.trainingserver.operations.GetAllActors;

public class TestTrainingServer {

    private String excelFileLocation = Constants.EXCEL_SHEETS + "/trainingServer";

    // @Test
    // public void getActiveCustomers() {
    // GetActiveCustomers getCustomers = new GetActiveCustomers();
    // getCustomers.sendRequest();
    // TestReporter.logAPI(getCustomers.getNumberOfResults() != 0, "Results were returned (" + getCustomers.getNumberOfResults() + ")", getCustomers);
    // TestReporter.assertTrue(getCustomers.validateResponse(excelFileLocation + "/GetActiveCustomersResponse.xls", "getActiveCustomers"), "Validate Response");
    // }
    //
    // @Test
    // public void getActorsByFirstName() {
    // GetActorsByFirstName getActors = new GetActorsByFirstName();
    // getActors.setActorFirst_nAme("Joe");
    // getActors.sendRequest();
    // String lName = getActors.getResponseNodeValueByXPath("/Envelope/Body/getActorsByFirstNameResponse/actor/last_name");
    // TestReporter.logAPI(getActors.getNumberOfResults() != 0, "Results were returned (" + getActors.getNumberOfResults() + ")", getActors);
    // TestReporter.assertTrue(lName.equals("SWANK"), "First actor LName in response == SWANK");
    // }
    //
    // @Test
    // public void getActorsById() {
    // GetActorsById getActors = new GetActorsById();
    // getActors.setActorId("1");
    // getActors.sendRequest();
    // int numResults = getActors.getNumberOfResults();
    // TestReporter.logAPI(numResults != 0, "Results were returned (" + numResults + ")", getActors);
    // TestReporter.assertTrue(getActors.validateResponse(excelFileLocation + "/GetActorsByIdResponse.csv", "getActorsById"), "Valid GetActorsById Response");
    // }
    //
    // @Test
    // public void getAddressByCity() {
    // GetAddressByCity getAddress = new GetAddressByCity();
    // getAddress.setCityName("Lethbridge");
    // getAddress.sendRequest();
    // int numResults = getAddress.getNumberOfResults();
    // TestReporter.logAPI(numResults != 0, "Results were returned (" + numResults + ")", getAddress);
    // TestReporter.assertTrue(getAddress.validateResponse(excelFileLocation + "/GetAddressByCity.csv", "getAddressByCity"), "Valid GetAddressByCity Response");
    // }
    //
    // @Test
    // public void getLanguageById() {
    // GetLanguageById getLanguage = new GetLanguageById();
    // getLanguage.setLanguageId("1");
    // getLanguage.sendRequest();
    // int numResults = getLanguage.getNumberOfResults();
    // TestReporter.logAPI(numResults != 0, "Results were returned (" + numResults + ")", getLanguage);
    // TestReporter.assertTrue(getLanguage.validateResponse(excelFileLocation + "/GetLanguageById.csv", "GetLanguageById"), "Valid GetLanguageById Response");
    // }

    // @Test
    // public void getAllLanguages() {
    // GetAllLanguages getLanguages = new GetAllLanguages();
    // getLanguages.sendRequest();
    // int numResults = getLanguages.getNumberOfResults();
    // TestReporter.logAPI(numResults != 0, "Results were returned (" + numResults + ")", getLanguages);
    // TestReporter.assertTrue(getLanguages.validateResponse(excelFileLocation + "/GetAllLanguages.csv", "GetAllLanguages"), "Valid GetAllLanguages Response");
    // }

    @Test
    public void getAllActors() {
        GetAllActors getActors = new GetAllActors();
        getActors.sendRequest();
        int numResults = getActors.getNumberOfResults();
        TestReporter.logAPI(numResults != 0, "Results were returned (" + numResults + ")", getActors);
        TestReporter.assertEquals(getActors.getFirstActorId(), "1", "HEYO");
        TestReporter.assertTrue(getActors.validateResponse(excelFileLocation + "/GetAllActors.csv", "GetAllActors"), "Valid GetAllActors Response");
    }

}
