package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /**
     *
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromeDriver.exe");
        WebDriver a= new ChromeDriver();
        a.get("https://www.amazon.com");
      String title=  a.getTitle();
       String url= a.getCurrentUrl();
        System.out.println(a.getCurrentUrl());
        System.out.println(a.getTitle());
        a.quit();



    }
}
