package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static String url="http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php";

        public static void main(String[] args) throws InterruptedException {
           /* Navigate to http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php
            verify the header text AUTOMATION TESTING PLATFORM BY SYNTAX is displayed
            verify enroll today button is enabled*/
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            WebElement syntaxText= driver.findElement(By.xpath("html/body/div/nav/div/div/div/a"));
            String text=syntaxText.getText();
            if(syntaxText.isDisplayed()){
                System.out.println(text);
            }else {
                System.out.println("Not displayed");
            }
          driver.switchTo().frame("FrameTwo");
            WebElement enrollButton= driver.findElement(By.xpath("//a[@class='enroll-btn']"));
            Thread.sleep(1000);

            enrollButton.click();







    }
}
