package tests;

import driver.DriverManager;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected AppiumDriver driver;

    @BeforeMethod
    public void setUp() {
        DriverManager manager = new DriverManager();
        driver = manager.createDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
