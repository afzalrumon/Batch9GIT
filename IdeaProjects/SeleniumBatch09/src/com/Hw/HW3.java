package com.Hw;

import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.security.util.Password;

public class HW3 {
    public static void main(String[] args) {
        /*HW 2
        HRMS Application Negative Login:
        Open chrome browser
        Go to “http://18.232.148.34/humanresources/symfony/web/index.php/auth/login”
        Enter valid username
        Leave password field empty
        Click on login button
        Verify error message with text “Password cannot be empty” is displayed.*/
        System.setProperty("webdriver.chrome.driver","drivers/chromeDriver.exe");

        WebDriver driver=new ChromeDriver();//Launch the browser
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement passwordBox=driver.findElement(By.cssSelector("input[id='txtUsername']"));
        passwordBox.sendKeys("Admin");
        WebElement logIn= driver.findElement(By.cssSelector("input[id='btnLogin']"));
        logIn.click();
        WebElement errorMsg= driver.findElement(By.cssSelector("span[id='spanMessage']"));
        boolean iserror=errorMsg.isDisplayed();
        if(iserror){
            System.out.println("Displayed");

        }else
        {
            System.out.println("Not Displayed");

        }

    }
}
