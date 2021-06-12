import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromeDriver.exe");
        WebDriver a=new ChromeDriver();
        a.navigate().to("https://www.facebook.com");
       // a.manage().window().fullscreen();
        a.manage().window().maximize();
        a.navigate().back();

    }
}
