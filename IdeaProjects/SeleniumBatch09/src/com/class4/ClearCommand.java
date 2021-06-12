package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommand {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromeDriver.exe");

        WebDriver driver=new ChromeDriver();//Launch the browser
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=[…]%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
     WebElement userNmeTextBox= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
   // WebElement passWordTextBox


    }
}
