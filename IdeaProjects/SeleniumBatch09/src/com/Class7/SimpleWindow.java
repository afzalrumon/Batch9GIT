package com.Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindow {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainHandle=driver.getWindowHandle();
        System.out.println(mainHandle);
        WebElement helpLink=driver.findElement(By.linkText("Help"));
        helpLink.click();
        Set<String> allWindowHandle= driver.getWindowHandles();
        System.out.println(allWindowHandle.size());
        Iterator<String> iterator=allWindowHandle.iterator();
       mainHandle= iterator.next();
       String childHandle=iterator.next();
        System.out.println(childHandle);
        Thread.sleep(1000);
        driver.switchTo().window(mainHandle);
        //driver.close();
        driver.quit();
    }
}
