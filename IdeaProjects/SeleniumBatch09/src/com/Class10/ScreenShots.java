package com.Class10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShots {

        public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx";

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
            username.sendKeys("Tester", Keys.TAB);
            WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));
            password.sendKeys("test",Keys.ENTER);
            TakesScreenshot takesScreenshot=(TakesScreenshot) driver;

            File file=takesScreenshot.getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(file,new File("ScreenShots/SmartBear/adminLoginn1.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
