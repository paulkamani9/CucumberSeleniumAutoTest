package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static actions.LoginPage.*;

public class LoginPage {
    @Given("^User navigates to Login Page$")
    public static void user_navigates_to_login_page () throws InterruptedException {
        validate_login_button_presence();
    }

    @When("^User provides valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public static void user_provides_valid_username_and_password (String username, String password) throws InterruptedException {
        enters_valid_username(username);
        enters_valid_password(password);
        click_login_button();
    }

    @When("^User provides \"([^\"]*)\" and \"([^\"]*)\"$")
    public static void user_provides_invalid_username_and_password (String invalid_username, String invalid_password) throws InterruptedException {
        enters_invalid_username(invalid_username);
        enters_invalid_password(invalid_password);
        click_login_button();
    }

    @Then("^An error message is displayed$")
    public static void an_error_message_is_displayed () throws InterruptedException {
        validate_error_message_presence();
    }
}
