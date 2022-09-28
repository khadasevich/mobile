package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class NavigationPage extends BasePage{

    private By STOPCLOCK_BUTTON = By.xpath("//nh[@content-desc='Stopwatch']");

    public NavigationPage(AppiumDriver driver) {
        super(driver);
    }

    public StopClockPage openStopClockPage() {
        driver.findElement(STOPCLOCK_BUTTON).click();
        return new StopClockPage(driver);
    }
}
