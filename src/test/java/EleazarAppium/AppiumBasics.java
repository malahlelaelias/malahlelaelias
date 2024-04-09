package EleazarAppium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class AppiumBasics extends BaseTest {


    @Test
    public void AppiumTest() throws MalformedURLException {





        //find element by xpath or accessibilityID
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id=\"android:id/checkbox\"]")).click();
        //tagname[@attribute='value'] xpath
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();

       // String title= driver.findElement(By.xpath("//android.widget.ListView[@resource-id=\"android:id/list\"]/android.widget.LinearLayout[2]/android.widget.RelativeLayout")).getText();
        //Assert.assertEquals(title,"WiFi settings");

        driver.findElement(By.id("android:id/edit")).sendKeys("Matudu");
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();








        //appiumServiceBuilder.build().stop();
    }
}
