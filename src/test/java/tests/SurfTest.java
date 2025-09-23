package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.HomePage;
import pages.ProizvodiPage;
import pages.SunCareProizvodi;

import java.time.Duration;

public class SurfTest extends BaseTest{

    HomePage homePage = new HomePage(driver, Duration.ofSeconds(15));
    ProizvodiPage proizvodiPage = new ProizvodiPage(driver, Duration.ofSeconds(15));
    SunCareProizvodi sunCareProizvodiPage = new SunCareProizvodi(driver, Duration.ofSeconds(15));


    @Test
    public void surf() {
        homePage.setLinkZaProizvode();
        proizvodiPage.pregledProizvodaGreenSunCare();
        sunCareProizvodiPage.pregledProizvodaLosionPosleSuncanja();
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()=\"Losion posle sunčanja\"]")).isDisplayed());
    }
}
