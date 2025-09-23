package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.HomePage;
import pages.SearchPage;

import java.time.Duration;

public class SearchTest extends BaseTest{

    HomePage homePage = new HomePage(driver, Duration.ofSeconds(10));
    SearchPage searchPage = new SearchPage(driver, Duration.ofSeconds(10));


    @Test
    public void pretragaLosiona() throws InterruptedException {
        homePage.setLinkZaPretragu();
        searchPage.pretragaPojma("losion");
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Losion')]")).isDisplayed());
    }
}
