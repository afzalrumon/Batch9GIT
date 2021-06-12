package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LogInTest {
    WebDriver driver;
    @BeforeMethod
    public void openBrowserAndLaunchApp(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Test
    public void validLogin(){
        WebElement userName= driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement password= driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement welcomeAttribute=driver.findElement(By.xpath("//*[text()='Welcome Admin']"));
        if (welcomeAttribute.isDisplayed()){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
    }
    @Test
    public void validateTitle(){
        String expectedTitle="Human Management System";
        String actualTitle=driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("Test is passed");
        }else {
            System.out.println("Test failed");
        }
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
