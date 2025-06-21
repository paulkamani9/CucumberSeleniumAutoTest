package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import utility.BrowserDriver;

public class ProductsPage extends BrowserDriver {
    public static String products_page_heading_xpath = "//*[@id=\"inventory_filter_container\"]/div";


    public static void validate_products_page () throws InterruptedException {
        String actual_products_page_heading = driver.findElement(By.xpath(products_page_heading_xpath)).getText();
        Assert.assertEquals("Products",actual_products_page_heading);
    }
}
