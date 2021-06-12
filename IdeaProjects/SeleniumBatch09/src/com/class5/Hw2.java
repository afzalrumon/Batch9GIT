package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Hw2 {
    public static String url="“https://www.facebook.com”";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromeDriver.exe");

        WebDriver driver=new ChromeDriver();//Launch the browser
                driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
        Thread.sleep(1000);
        WebElement monthDD= driver.findElement(By.id("month"));
        Thread.sleep(1000);
        Select select=new Select(monthDD);
        Thread.sleep(1000);
        System.out.println(select.isMultiple());
        List<WebElement>options=select.getOptions();
        System.out.println(options.size());
        Thread.sleep(1000);
select.selectByIndex(1);

        for (WebElement option:options
             ) {

            String monthText=option.getText();
            System.out.println(monthText);

        }
        Thread.sleep(500);
        driver.quit();

    }
}
