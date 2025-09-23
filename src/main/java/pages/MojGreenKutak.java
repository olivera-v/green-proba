package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class MojGreenKutak extends BasePage{

    public By usernameField = By.xpath("//*[text()=\"Green ID\"]");
    public By passwordField = By.xpath("//*[text()=\"Lozinka\"]");
    public By prijavaButton = By.id("login-submit");






    public MojGreenKutak(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }

    public void logovanje (String username, String password){
        type(usernameField, username);
        type(passwordField,password);
        driver.findElement(prijavaButton).click();
    }



}
