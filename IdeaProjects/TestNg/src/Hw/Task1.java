package Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task1 {
    public WebDriver driver;
    @BeforeMethod
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver",
                "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test(priority = 1)
    public  void verifyingPasswordErrorMessage(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        //driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        WebElement errorMsg=driver.findElement(By.id("spanMessage"));
        String actualText= errorMsg.getText();
        String expectedText="Password cannot be empty";
        Assert.assertTrue(errorMsg.isDisplayed());
        Assert.assertEquals(actualText,expectedText);
        System.out.println("Equals");
    }
    @Test(priority = 2)
    public  void verifyingUserAndPassWordErrorMessage(){
        //driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        //driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        WebElement errorMsg=driver.findElement(By.id("spanMessage"));
        String actualText= errorMsg.getText();
        String expectedText="Username cannot be empty";
        Assert.assertTrue(errorMsg.isDisplayed(),"Displayed");
        Assert.assertEquals(actualText,expectedText);
        System.out.println("Equals");
    }
    @Test(priority = 3)
    public  void verifyingInvalidCredentialErrorMessage(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm12");
        driver.findElement(By.id("btnLogin")).click();
        WebElement errorMsg=driver.findElement(By.id("spanMessage"));
        String actualText= errorMsg.getText();
        String expectedText="Invalid credentials";
        Assert.assertTrue(errorMsg.isDisplayed());
        Assert.assertEquals(actualText,expectedText);
        System.out.println("Equals");

    }


}
