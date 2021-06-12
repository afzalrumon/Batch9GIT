package utils;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class CommonMethods {
    public static WebDriver driver;
    public void setUp() {
      ConfigReader.readProperties("C:\\Users\\ahuss\\IdeaProjects\\TestNg\\src\\config\\config.properties");
      switch (ConfigReader.getPropertiesvalue("browser")){
          case "chrome":
              System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
              driver=new ChromeDriver();
              break;
          case "firefox":
              System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
              driver=new FirefoxDriver();
              break;

          default:
              throw new RuntimeException("Invalid name of browser");
      }
      driver.get(ConfigReader.getPropertiesvalue("url"));
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
    public static void tearDown(){
if (driver!=null){
    driver.quit();
}
    }
}

