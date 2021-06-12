package com.Hw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultuWindowManaging {
    public static void main(String[] args) {
        String url="https://demoqa.com/browser-windows";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);


    }
}
