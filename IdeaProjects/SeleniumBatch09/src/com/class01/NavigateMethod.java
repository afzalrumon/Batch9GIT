package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromeDriver.exe");
        WebDriver  a=new ChromeDriver();
        a.get("https://www.facebook.com");
        a.navigate().to("https://google.com");
        Thread.sleep(1000);
        a.navigate().back();
        Thread.sleep(1000);
        a.navigate().forward();
        a.navigate().refresh();
       // a.quit(); //will  close the browser
        a.close();//will close the current tab





    }
}
