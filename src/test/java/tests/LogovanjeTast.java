package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.MojGreenKutak;
//import pages.MojGreenKutak;

import java.time.Duration;
import java.util.Set;

public class LogovanjeTast extends BaseTest{

    HomePage homePage = new HomePage(driver, Duration.ofSeconds(10));
    MojGreenKutak mojGreenKutak = new MojGreenKutak(driver, Duration.ofSeconds(10));



    // Kako da se prebacim na drugi Tab?

//    @Test
//    public void neuspesnoLogovanje(){
//        homePage.setLinkZaMojGreenKutak();
//        homePage.switchToNewlyOpenedTab(driver);
//        mojGreenKutak.logovanje("nesto","nesto");
//        Assert.assertTrue(driver.findElement(By.id("login-submit")).isDisplayed());
//
//
//    }


}
