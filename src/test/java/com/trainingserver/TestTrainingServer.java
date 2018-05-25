package com.trainingserver;

import org.testng.annotations.Test;

import com.orasi.utils.Constants;
import com.orasi.utils.TestReporter;
import com.trainingserver.operations.GetActiveCustomers;
import com.trainingserver.operations.GetActorsByFirstName;
import com.trainingserver.operations.GetActorsById;

public class TestTrainingServer {

    private String excelFileLocation = Constants.EXCEL_SHEETS + "/trainingServer";

    @Test
    public void getActiveCustomers() {
        GetActiveCustomers getCustomers = new GetActiveCustomers();
        getCustomers.sendRequest();
        TestReporter.logAPI(getCustomers.getNumberOfResults() != 0, "Results were returned (" + getCustomers.getNumberOfResults() + ")", getCustomers);
        TestReporter.assertTrue(getCustomers.validateResponse(excelFileLocation + "/GetActiveCustomersResponse.xls", "getActiveCustomers"), "Validate Response");
    }

    @Test
    public void getActorsByFirstName() {
        GetActorsByFirstName getActors = new GetActorsByFirstName();
        getActors.setActorFirst_nAme("Joe");
        getActors.sendRequest();
        String lName = getActors.getResponseNodeValueByXPath("/Envelope/Body/getActorsByFirstNameResponse/actor/last_name");
        TestReporter.logAPI(getActors.getNumberOfResults() != 0, "Results were returned (" + getActors.getNumberOfResults() + ")", getActors);
        TestReporter.assertTrue(lName.equals("SWANK"), "First actor LName in response == SWANK");
    }

    @Test
    public void getActorsById() {
        GetActorsById getActors = new GetActorsById();
        getActors.setActorId("1");
        getActors.sendRequest();
        int numResults = getActors.getNumberOfResults();
        TestReporter.logAPI(numResults != 0, "Results were returned (" + numResults + ")", getActors);
    }
}
