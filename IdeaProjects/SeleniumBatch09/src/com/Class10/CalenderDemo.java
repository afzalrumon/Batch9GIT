package com.Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo {
    public static void main(String[] args) {
        String url = "https://www.delta.com";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement departure=driver.findElement(By.className("col-lg-3 col-sm-12 d-lg-block offset-md-2 col-md-8 offset-lg-0 book-element booking-element d-sm-none ng-star-inserted"));
        departure.click();
        WebElement momthDD= driver.findElement(By.className("dl-datepicker-month-0"));
        String Text=momthDD.getText();
        WebElement clickNext= driver.findElement(By.xpath("//span[text()='Next']"));
        while(!Text.contains("July")){
            System.out.println(Text);
            clickNext.click();
        }

    }
}
