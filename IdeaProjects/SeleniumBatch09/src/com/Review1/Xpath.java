package com.Review1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromeDriver.exe");

        WebDriver driver=new ChromeDriver();//Launch the browser

        String url="https://www.bbc.com/news";
        driver.get(url);
        Thread.sleep(2000);
        //driver.findElement(By.xpath("html/body/header/div/div/div[2]/div/a")).click();
        driver.findElement(By.xpath("//a[@id='idcta-link']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Register now']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains( @href,'age?')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[starts-with(@id,'day')]")).sendKeys("29");
        Thread.sleep(2000);
driver.findElement(By.xpath("//input[starts-with(@id,'month')]")).sendKeys("02");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[starts-with(@id,'year')]")).sendKeys("2000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[starts-with(@id,'submit-button')]")).click();





    }

}
