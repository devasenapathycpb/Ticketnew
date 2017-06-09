package StepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import utils.LmsActionContainer;

import static org.junit.Assert.assertTrue;


public class MyStepdefs {
    private LmsActionContainer lmsActionContainer;

    public MyStepdefs(LmsActionContainer lmsActionContainer) {
        this.lmsActionContainer = lmsActionContainer;
    }

    @And("^I click on Men Tab$")
    public void iclickOnMenTab() throws Exception {

    }

    @And("^I click on Search Text Box$")
    public void iClickOnSearchTextBox() throws Throwable {
        assertTrue(lmsActionContainer.TicketNewAction.ClickSearchTextBox());
    }
}




