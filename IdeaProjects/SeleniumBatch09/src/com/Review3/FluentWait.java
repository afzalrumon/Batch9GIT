package com.Review3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWait {
    public static void main(String[] args) {
        String url = "http://the-internet.herokuapp.com/dynamic_loading/1";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchFieldException.class);

    }
}
