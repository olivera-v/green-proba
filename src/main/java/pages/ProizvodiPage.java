package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class ProizvodiPage extends BasePage{

    private By negaTela = By.xpath("//a[contains(@aria-label, \"Posetite kategoriju proizvoda Nega tela\")]/img");
    private By greenSpa = By.xpath("//a[contains(@aria-label, \"Posetite kategoriju proizvoda Green SPA\")]/img");
    private By greenUnique = By.xpath("//a[contains(@aria-label, \"Posetite kategoriju proizvoda Green UNIQUE\")]/img");
    private By negaLica = By.xpath("//a[contains(@aria-label, \"Posetite kategoriju proizvoda Nega lica\")]/img");
    private By negaKose = By.xpath("//a[contains(@aria-label, \"Posetite kategoriju proizvoda [:en]Hair Care[:sr]Nega kose[:]\")]/img");
    private By oralnaHigijena = By.xpath("//a[contains(@aria-label, \"Posetite kategoriju proizvoda [:sr]Oralna higijena [:en]Oral Hygiene [:]\")]/img");
    private By licnaHigijena = By.xpath("//a[contains(@aria-label, \"Posetite kategoriju proizvoda Lična higijena\")]/img");
    private By miniGreeny = By.xpath("//a[contains(@aria-label, \"Posetite kategoriju proizvoda mini Greeny\")]/img");
    private By greenSunCare = By.xpath("//a[contains(@aria-label, \"Posetite kategoriju proizvoda Green SUN CARE\")]/img");
    private By higijenaDoma = By.xpath("//a[contains(@aria-label, \"Posetite kategoriju proizvoda [:sr]Higijena doma[:en]Household Care[:]\")]/img");
    private By greenSana = By.xpath("//a[contains(@aria-label, \"Posetite kategoriju proizvoda Green SANA+\")]/img");


    //    Konstruktor

    public ProizvodiPage(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }

    public void pregledProizvodaZaNeguTela (){
       moveToAndClick(negaTela);
    }

    public void pregledProizvodaGreenSpa (){
        moveToAndClick(greenSpa);
    }

    public void pregledProizvodaGreenUnique (){
        moveToAndClick(greenUnique);
    }

    public void pregledProizvodaZaNeguLica (){
        moveToAndClick(negaLica);
    }

    public void pregledProizvodaZaNeguKose (){
        moveToAndClick(negaKose);
    }

    public void pregledProizvodaZaOralnuHigijenu (){
        moveToAndClick(oralnaHigijena);
    }

    public void pregledProizvodaZaLicnuHigijenu (){
        moveToAndClick(licnaHigijena);
    }

    public void pregledProizvodaMiniGreeny (){
        moveToAndClick(miniGreeny);
    }

    public void pregledProizvodaGreenSunCare (){
        moveToAndClick(greenSunCare);
    }

    public void pregledProizvodaZaHigijenuDoma (){
        moveToAndClick(higijenaDoma);
    }

    public void pregledProizvodaGreenSana (){
        moveToAndClick(greenSana);
    }

}
