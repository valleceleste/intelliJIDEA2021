package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.fluentlenium.core.search.Search;
import tasks.Login;
import tasks.OpenUp;

public class ChoucairAcademySepDefinitions {
    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());}


    @Given("^than celeste wants to learn automation at the academy Choucair$")
    public void thancelesteWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("celeste").wasAbleTo(OpenUp.thePage(),(Login.onThePage()));
    }


    @When("^he search for the course (.*) on the Choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorCalled("celeste").attemptsTo(Search.the(course));

    }

    @Then("^he finds the course call resources Recursos Automatización Bancolombia$")
    public void heFindsTheCourseCallResourcesRecursosAutomatizacionBancolombia() {
        OnStage.theActorCalled("celeste").attemptsTo(OpenUp.thePage());

    }
}
