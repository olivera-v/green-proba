package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class MojGreenKutak extends BasePage{

    public By usernameField = By.xpath("//*[@id=\"username\"]");
    public By passwordField = By.xpath("//*[@id=\"password\"]");
    public By prijavaButton = By.id("login-submit");






    public MojGreenKutak(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }

    public void logovanje (String username, String password){
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(prijavaButton).click();
    }



}
