package actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;
import static pages.LoginPage.*;
// this is a test comment

public class LoginPage extends BrowserDriver {
    public static void validate_login_button_presence() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        Assert.assertTrue(driver.findElement(By.id(login_button_id)).isDisplayed());

    }

    public static void enters_valid_username(String username) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id(user_name_input_id)).sendKeys(username);

    }

    public static void enters_valid_password(String password) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id(password_input_id)).sendKeys(password);

    }

    public static void click_login_button() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id(login_button_id)).click();
    }

    public static void enters_invalid_username(String invalid_username) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id(user_name_input_id)).sendKeys(invalid_username);

    }

    public static void enters_invalid_password(String invalid_password) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id(password_input_id)).sendKeys(invalid_password);

    }

    public static void validate_error_message_presence() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.xpath(error_message_xpath)).isDisplayed());
    }
}

