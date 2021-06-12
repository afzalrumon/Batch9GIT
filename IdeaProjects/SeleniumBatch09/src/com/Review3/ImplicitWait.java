package com.Review3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {
        String url = "http://the-internet.herokuapp.com/dynamic_loading/1";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebDriverWait wait=new WebDriverWait(driver,20);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//a[@]"))
        driver.findElement(By.xpath("//button")).click();
       // driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Helloo");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Hello')]")));
        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Hello')]"));
        String text=element.getText();
        System.out.println(text);


    }
}
