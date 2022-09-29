package tests;

import appium.AppiumService;
import driver.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected AppiumDriver driver;
    private AppiumDriverLocalService server;
    private AppiumService appiumService;

    @BeforeMethod
    public void setUp() {
        appiumService = new AppiumService();
        server = appiumService.startService();
        DriverManager manager = new DriverManager();
        driver = manager.createDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        appiumService.stopService();
    }
}
