package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ParallelTest {
    WebDriver driver;

    @BeforeMethod
    public void openBrowserAndLaunchApp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void invalidLogin() {
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        //WebElement password= driver.findElement(By.id("txtPassword"));
        //password.sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement errorField = driver.findElement(By.id("spanMessage"));
        String receivingText= errorField.getText();
        String ExpectedText="Password cannot be empty";
        Assert.assertEquals(receivingText,ExpectedText);
        System.out.println("Test is passed");
        if (receivingText.equals(ExpectedText)) {
            System.out.println("Test is passed and error is displayed");
        } else {
            System.out.println("Test is failed and is not available");
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
