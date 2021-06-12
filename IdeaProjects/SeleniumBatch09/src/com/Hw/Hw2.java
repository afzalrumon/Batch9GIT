package com.Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class Hw2 {
    public static void main(String[] args) {
       /* TC 1: Amazon link count:
        Open chrome browser
        Go to “https://www.amazon.com/”
        Get all links
        Get number of links that has text
        Print to console only the links that has text*/
        System.setProperty("webdriver.chrome.driver","drivers/chromeDriver.exe");

        WebDriver driver=new ChromeDriver();//Launch the browser
        driver.get("https://www.amazon.com/");

         //List<WebElement>  allLink= driver.findElement(By.tagName("a"));
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Number of links " +  allLinks.size());
        Iterator iterator=allLinks.iterator();
         int counter=0;
        while (iterator.hasNext()){
         WebElement link= (WebElement) iterator.next();
           String fullLink= link.getAttribute("href");
           String fullText=link.getText();
           if (!fullText.isEmpty())
            { System.out.println(fullText+"      "+fullLink);
             counter++;
            };} System.out.println(counter); }
}
