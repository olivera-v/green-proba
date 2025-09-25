package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.time.Duration;

public class BaseTest {

    protected static WebDriver driver;

    @BeforeClass
    public static void beforeAll() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
//        max time to wait for a page load
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
//        max time for asynchronous JS run
    }

    @Before
    public void beforeEach() {
        driver.get("https://greenbsn.com/sr/");
    }

    @After
    public void afterEach() {
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void afterAll() {
        driver.quit();
    }












}
