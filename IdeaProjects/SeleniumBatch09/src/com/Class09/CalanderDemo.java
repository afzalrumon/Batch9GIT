package com.Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalanderDemo {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement userName= driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement password= driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement logInButton= driver.findElement(By.id("btnLogin"));
        logInButton.click();
        WebElement leaveButton= driver.findElement(By.linkText("Leave"));
        leaveButton.click();
        WebElement fromCalander= driver.findElement(By.id("calFromDate"));
        fromCalander.click();
        WebElement mDD= driver.findElement(By.className("ui-datepicker-month"));
        Select monthDD=new Select(mDD);
        monthDD.selectByVisibleText("Jul");

    }
}
