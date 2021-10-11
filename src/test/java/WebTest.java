import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest {

    @Test
    public void testOne() throws InterruptedException {
        WebDriver driver;

        String driverPath = "C://Projects//chromedriver.exe";
        String chromeDriver = "webdriver.chrome.driver";
        String url = " http://www.99-bottles-of-beer.net/";
        String expResult = "http://www.99-bottles-of-beer.net/";


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver = new ChromeDriver();

        System.setProperty("webdriver.chrome.driver", "C://Projects//chromedriver.exe");
        System.setProperty(chromeDriver, driverPath);

        driver.get(url);
        Thread.sleep(3000);

        String actResult = driver.getCurrentUrl();

        Assert.assertEquals(actResult, expResult);

        driver.close();
        driver.quit();

    }

}
