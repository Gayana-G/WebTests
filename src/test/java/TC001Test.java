import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001Test {
    private WebDriver driver;

    String driverPath = "C://Projects//chromedriver.exe";
    String chromeDriver = "webdriver.chrome.driver";
    String url = " http://www.99-bottles-of-beer.net/";


    @BeforeMethod
    public void setUp(){

        System.setProperty(chromeDriver, driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterTest
    public void setDown(){

        driver.close();
        driver.quit();

    }

    @Test
    public void testTC001() throws InterruptedException {

        String expResult = "http://www.99-bottles-of-beer.net/";

        driver.get(url);
        Thread.sleep(3000);

        String actResult = driver.getCurrentUrl();

        Assert.assertEquals(actResult, expResult);

    }
//    public void testTC002(){
//
//        String expResult = "Welcome to 99 Bottles of Beer";
//
//        driver.get(url);
//        String headerText = "99 Bottles of Beer | Start";
//    }
}
