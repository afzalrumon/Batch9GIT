package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CommonMethod {
    public static WebDriver driver;

    /**
     *
     * @param url
     */

    public static void setUpWithSpeceficUrl(String url){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
         driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    public static void tearDown(){
       if (driver !=null){
           driver.quit();
       }

    }
}
