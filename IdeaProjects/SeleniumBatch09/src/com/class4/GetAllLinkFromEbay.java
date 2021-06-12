package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinkFromEbay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromeDriver.exe");

        WebDriver driver=new ChromeDriver();//Launch the browser
        driver.get("https://www.ebay.com/");
       List<WebElement>allLink= driver.findElements(By.tagName("a"));
       allLink.size();
        System.out.println(allLink.size());
        for (WebElement link:allLink
             ) {
           String fullLink= link.getAttribute("href");
          String linkText=link.getText();
          if (!linkText.isEmpty()){
              System.out.println(linkText+"     "+fullLink);
          }


        }
    }
}
