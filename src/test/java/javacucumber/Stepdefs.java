package javacucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

class DoIFeelLucky {
    static String iAskDoIFeelLucky(String feeling) {
        return "yes";
    }
}

public class Stepdefs {
    private String feeling;
    private String actualAnswer;

    @Given("^feeling lucky$")
    public void feeling_lucky() {
        this.feeling = "yes";
    }

    @When("^I ask myself, do I feel lucky\\?$")
    public void iAskDoYouFeelLucky() {
        this.actualAnswer = DoIFeelLucky.iAskDoIFeelLucky(feeling);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void iShouldBeTold(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}