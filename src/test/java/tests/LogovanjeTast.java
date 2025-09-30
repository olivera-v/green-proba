package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.HomePage;
import pages.MojGreenKutak;
//import pages.MojGreenKutak;

import java.time.Duration;

public class LogovanjeTast extends BaseTest{

    HomePage homePage = new HomePage(driver, Duration.ofSeconds(10));
    MojGreenKutak mojGreenKutak = new MojGreenKutak(driver, Duration.ofSeconds(10));



    

    @Test
    public void neuspesnoLogovanje(){
        homePage.setLinkZaMojGreenKutak();
        homePage.switchToNewlyOpenedTab();
        mojGreenKutak.logovanje("nesto","nesto");
        Assert.assertTrue(driver.findElement(By.id("login-submit")).isDisplayed());
    }


}
