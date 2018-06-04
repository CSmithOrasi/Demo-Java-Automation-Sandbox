package com.trainingserver.soap;

import org.testng.annotations.Test;

import com.orasi.utils.Constants;
import com.orasi.utils.TestReporter;
import com.trainingserver.soap.operations.CreateActor;
import com.trainingserver.soap.operations.DeleteActor;
import com.trainingserver.soap.operations.GetAllActors;
import com.trainingserver.soap.operations.GetAllLanguages;
import com.trainingserver.soap.operations.GetLanguageById;
import com.trainingserver.soap.operations.UpdateActor;

public class TestSoap {
    String actorId;

    private String excelFileLocation = Constants.EXCEL_SHEETS + "/trainingServer";

    // Commented out tests have not been updated to reflect new server naming conventions (e.g. filmId not film_id)

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
    @Test
    public void getLanguageById() {
        GetLanguageById getLanguage = new GetLanguageById();
        getLanguage.setLanguageId("1");
        getLanguage.sendRequest();
        int numResults = getLanguage.getNumberOfResults();
        TestReporter.logAPI(numResults != 0, "Results were returned (" + numResults + ")", getLanguage);
        TestReporter.assertTrue(getLanguage.validateResponse(excelFileLocation + "/GetLanguageById.csv", "GetLanguageById"), "Valid GetLanguageById Response");
    }

    @Test
    public void getAllLanguages() {
        GetAllLanguages getLanguages = new GetAllLanguages();
        getLanguages.sendRequest();
        int numResults = getLanguages.getNumberOfResults();
        TestReporter.logAPI(numResults != 0, "Results were returned (" + numResults + ")", getLanguages);
        TestReporter.assertTrue(getLanguages.validateResponse(excelFileLocation + "/GetAllLanguages.csv", "GetAllLanguages"), "Valid GetAllLanguages Response");
    }

    @Test
    public void getAllActors() {
        GetAllActors getActors = new GetAllActors();
        getActors.sendRequest();
        int numResults = getActors.getNumberOfResults();
        TestReporter.logAPI(numResults != 0, "Results were returned (" + numResults + ")", getActors);
        // Always true VVV
        TestReporter.assertEquals(getActors.getFirstActorId(), "1", getActors.getFirstActorId() + " == 1");
        TestReporter.assertTrue(getActors.validateResponse(excelFileLocation + "/GetAllActors.csv", "GetAllActors"), "Valid GetAllActors Response");
    }

    @Test
    public void createActor() {
        String firstName = "NOTTA";
        String lastName = "REALPERSON";

        CreateActor createActor = new CreateActor();
        createActor.setFirstName(firstName);
        createActor.setLastName(lastName);
        createActor.sendRequest();

        // TestReporter.log(createActor.getResponse());
        TestReporter.assertEquals("200", createActor.getResponseStatusCode(), "Response status code == 200");
        TestReporter.assertEquals(firstName, createActor.getResponseFirstName(), "firstName == " + firstName);
        TestReporter.assertEquals(lastName, createActor.getResponseLastName(), "lastName == " + lastName);

        actorId = createActor.getActorId();
    }

    @Test(dependsOnMethods = "createActor")
    public void updateActor() {
        String firstName = "STILLNOT";
        String lastName = "REAL";

        UpdateActor updateActor = new UpdateActor();
        updateActor.setActorId(actorId);
        updateActor.setNewFirstName(firstName);
        updateActor.setNewLastName(lastName);
        updateActor.sendRequest();

        TestReporter.assertEquals("200", updateActor.getResponseStatusCode(), "Response status code == 200");
        TestReporter.assertEquals(actorId, updateActor.getResponseActorId(), "actorId == " + actorId);
        TestReporter.assertEquals(firstName, updateActor.getResponseFirstName(), "firstName == " + firstName);
        TestReporter.assertEquals(lastName, updateActor.getResponseLastName(), "lastName == " + lastName);
    }

    @Test(dependsOnMethods = "updateActor")
    public void deleteActor() {
        DeleteActor deleteActor = new DeleteActor();
        deleteActor.setActorId(actorId);
        deleteActor.sendRequest();

        TestReporter.assertEquals("200", deleteActor.getResponseStatusCode(), "Response status code == 200");
        String expectedMessage = "Actor [" + actorId + "] was deleted successfully.";
        TestReporter.assertEquals(expectedMessage, deleteActor.getResponseMessage(), "Expected: " + expectedMessage + " / Actual: " + deleteActor.getResponse());

    }
}
