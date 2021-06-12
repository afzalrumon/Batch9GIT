package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClasSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromeDriver.exe");

        WebDriver driver=new ChromeDriver();//Launch the browser
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");
        driver.manage().window().maximize();
        WebElement startPractising = driver.findElement(By.cssSelector("a#btn_basic_example"));
        startPractising.click();
        Thread.sleep(2000);
        WebElement simpleFormDemo = driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[2]"));
        simpleFormDemo.click();
        Thread.sleep(2000);
        WebElement  enterMessage= driver.findElement(By.cssSelector("input[placeholder^='Please enter']"));
        enterMessage.sendKeys("practice makes perfect");
        WebElement showMessage= driver.findElement(By.cssSelector("button[onclick*='show']"));
        showMessage.click();
        driver.quit();


    }
}
