package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class HomePage extends BasePage{

    private By linkZaMojGreenKutak = By.xpath("//*[text()=\"Moj Green kutak\"]");
    private By linkZaPretragu= By.xpath("(//*[@class=\"qode_icon_font_elegant icon_search \"])[1]");
    private By linkZaBurgerMeni = By.xpath("//*[@class=\"popup_menu normal\"]");
    private By linkZaGreen = By.xpath("//*[@id=\"nav-menu-item-61\"]");
    private By linkZaNovosti = By.id("nav-menu-item-2839");
    private By linkZaProizvode = By.id("nav-menu-item-892");
    private By linkZaDogadjajiAkcije = By.id("nav-menu-item-1343");
    private By linkZaCene = By.id("nav-menu-item-331");
    private By linkZaKontakt = By.id("nav-menu-item-854");



// Konsturktor

    public HomePage(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }

    public void setLinkZaMojGreenKutak (){
        waitForVisible(linkZaMojGreenKutak).click();
    }

    public void setLinkZaPretragu (){
        waitForVisible(linkZaPretragu).click();
    }

    public void setLinkZaBurgerMeni (){
        waitForVisible(linkZaBurgerMeni).click();
    }

    public void setLinkZaProizvode(){
        waitForVisible(linkZaProizvode).click();
    }
    public void setLinkZaGreen (){
        waitForVisible(linkZaGreen).click();
    }
    public void setLinkZaDogadjajiAkcije (){
        waitForVisible(linkZaDogadjajiAkcije).click();
    }

    public void setLinkZaCene (){
        waitForVisible(linkZaCene).click();
    }

    public void setLinkZaKontakt (){
        waitForVisible(linkZaKontakt).click();
    }
    public void setLinkZaNovosti (){
        waitForVisible(linkZaNovosti).click();
    }
}
