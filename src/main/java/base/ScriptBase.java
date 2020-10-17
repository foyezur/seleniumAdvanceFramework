package base;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class ScriptBase {

    public WebDriver driver;
    @Parameters({"browser"})
    @BeforeTest
    public void init(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
            driver = new ChromeDriver();
            System.out.println("test with chrome: " + Thread.currentThread().getId());
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
            driver = new FirefoxDriver();
            System.out.println("test with firefox: " + Thread.currentThread().getId());
        } else if (browser.equalsIgnoreCase("safari")) {
            System.setProperty("webdriver.safari.noinstall", "true");
            driver = new SafariDriver();
            System.out.println("test with safari: " + Thread.currentThread().getId());
        } else if (browser.equalsIgnoreCase("opera")) {
            DesiredCapabilities Capabilities = new DesiredCapabilities();
            System.setProperty("webdriver.opera.driver", "./drivers/operadriver");
            driver = new OperaDriver(Capabilities);

        }
        driver.get("http://automationpractice.com/index.php");
    }
        @AfterTest
        public void afterTest () {
            driver.quit();
        }

    }