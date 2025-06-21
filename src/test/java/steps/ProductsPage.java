package steps;

import io.cucumber.java.en.Then;
import static pages.ProductsPage.*;

public class ProductsPage {

    @Then("^User should view products page$")
    public static void user_should_view_products_page() throws InterruptedException{
        validate_products_page();
    }
}
