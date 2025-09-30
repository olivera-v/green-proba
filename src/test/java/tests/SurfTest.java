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
    public void surfLosion() {
        homePage.setLinkZaProizvode();
        proizvodiPage.pregledProizvodaGreenSunCare();
        sunCareProizvodiPage.pregledProizvodaLosionPosleSuncanja();
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()=\"Losion posle sunčanja\"]")).isDisplayed());
    }

    @Test
    public void surfSPF15() {
            homePage.setLinkZaProizvode();
            proizvodiPage.pregledProizvodaGreenSunCare();
            sunCareProizvodiPage.pregledProizvodaMlekoSPF15();
            Assert.assertTrue(driver.findElement(By.xpath("//h1[text()=\"Mleko za sunčanje SPF 15\"]")).isDisplayed());
    }

    @Test
    public void surfSPF30() {
        homePage.setLinkZaProizvode();
        proizvodiPage.pregledProizvodaGreenSunCare();
        sunCareProizvodiPage.pregledProizvodaMlekoSPF30();
        Assert.assertTrue(driver.findElement(By.xpath("//h1[text()=\"Mleko za sunčanje SPF 30\"]")).isDisplayed());
    }

    @Test
    public void kontrolniSurfSPF30() {
        homePage.setLinkZaProizvode();
        proizvodiPage.pregledProizvodaGreenSunCare();
        sunCareProizvodiPage.pregledProizvodaMlekoSPF30();
        Assert.assertTrue(driver.findElement(By.xpath("//h1[text()=\"Mleko za sunčanje SPF 15\"]")).isDisplayed());
    }
}

