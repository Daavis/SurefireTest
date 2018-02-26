package Tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverManager {
 
    public WebDriver driver;
 
    public WebDriver getDriver(String browser) throws MalformedURLException {
        DesiredCapabilities caps = null;
        if (browser == "chrome") {
            caps = DesiredCapabilities.chrome();
        } else if (browser == "firefox") {
            caps = DesiredCapabilities.firefox();
        }
 
        return driver = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"), caps);
    }
    
    @After
    public void quitDriver() {
        driver.quit();
    }
}