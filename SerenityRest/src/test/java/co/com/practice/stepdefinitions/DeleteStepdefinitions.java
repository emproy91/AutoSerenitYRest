package co.com.practice.stepdefinitions;

import co.com.practice.tasks.*;
import co.com.practice.utils.resource.WebServiceEndPoints;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DeleteStepdefinitions {

    @When("Call Delete user API")
    public void callDeleteUserAPI() {
        theActorInTheSpotlight().attemptsTo(
                ConsumeDelete.service(
                        WebServiceEndPoints.URI.getUrl()
                ));
    }
}