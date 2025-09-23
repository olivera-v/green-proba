package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;
    protected JavascriptExecutor js;
    Faker faker = new Faker();

    //    Konstruktor
    public BasePage (WebDriver driver, Duration timeout){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, timeout);
        this.actions = new Actions(driver);
        this.js = (JavascriptExecutor) driver;
    }


    // ---- Navigation ----
    public void navigateTo(String url) {
        driver.get(url);
        waitForPageToLoad();
    }
    public void waitForPageToLoad() {
        wait.until(d -> js.executeScript("return document.readyState").equals("complete"));
    }

    //    Cekanje na vidljivost
    public WebElement waitForVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // ---- Actions (mouse/keyboard) ----
        public void moveToAndClick(By locator) {
        actions.moveToElement(waitForVisible(locator)).click().perform();
    }

    //     Unos teksta
    public void type(By locator, String text) {
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        el.clear();
        el.sendKeys(text);
    }
    //     Unos teksta sa potvrdom
    public void typeAndClick(By locator, String text) {
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        el.clear();
        el.sendKeys(text);
        el.submit();
    }
    // ---- Frames & Windows ----
    public void switchToFrame(By locator) {
        driver.switchTo().frame(waitForVisible(locator));
    }

    public void switchToNewlyOpenedTab () {
        String originalTab = driver.getWindowHandle();

        // Čekamo dok se ne pojavi više od 1 taba
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(d -> d.getWindowHandles().size() > 1);

        // Prebacujemo se na tab koji nije originalni
        for (String tabHandle : driver.getWindowHandles()) {
            if (!tabHandle.equals(originalTab)) {
                driver.switchTo().window(tabHandle);
                break;
            }
        }
    }



}
