package EleazarAppium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public AndroidDriver driver;
    public AppiumServiceBuilder appiumServiceBuilder;

    @BeforeClass
    public void ConfigureAppium() throws MalformedURLException {
        appiumServiceBuilder= new AppiumServiceBuilder();
        appiumServiceBuilder.withAppiumJS(new File("C:\\Users\\Admin\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).build().start();


        BasicConfigurator.configure();
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel 2 XL API 34");
        //options.setApp("C:\\Users\\Admin\\IdeaProjects\\untitled1\\src\\test\\java\\Resources\\ApiDemos-debug.apk");
        options.setApp("C:\\Users\\Admin\\IdeaProjects\\untitled1\\src\\test\\java\\Resources\\General-Store.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);

    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
        appiumServiceBuilder.build().stop();

    }
}
