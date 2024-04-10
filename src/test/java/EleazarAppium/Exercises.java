package EleazarAppium;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Exercises extends BaseTest {


    @Test
    public void exercise() throws MalformedURLException {




    driver.findElement(AppiumBy.accessibilityId("App")).click();








        appiumServiceBuilder.build().stop();
    }
}
