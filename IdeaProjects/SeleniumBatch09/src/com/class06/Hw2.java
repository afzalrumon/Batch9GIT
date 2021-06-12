package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {
    public static String url="http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php";
    public static void main(String[] args) throws InterruptedException {
     /*   Go to http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php
        click on each button and handle the alert accordingly*/

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();

        Alert simpleAlert=driver.switchTo().alert();
        Thread.sleep(1000);
        simpleAlert.accept();
        driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
        Alert conFirmationAlert=driver.switchTo().alert();
        conFirmationAlert.dismiss();
        driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
        Thread.sleep(1000);
        Alert promptAlerrt=driver.switchTo().alert();
        promptAlerrt.sendKeys("Afzal Rumon");
        Thread.sleep(1000);
        promptAlerrt.accept();





    }
}
