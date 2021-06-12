package com.Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Class5Hw {
    public static String url="https://www.facebook.com";
    public static void main(String[] args) {
        /*TC 1: Facebook dropdown verification
        Open chrome browser
        Go to “https://www.facebook.com”
        click on create new account
        Verify:
        month dd has 12 month options
        day dd has 31 day options
        year dd has 115 year options
        Select your date of birth
        Quit browser*/
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
        WebElement months=driver.findElement(By.id("month"));

        Select select=new Select(months);
      List<WebElement> allMonths = select.getOptions();
      select.selectByVisibleText("May");
     int size= allMonths.size();
        System.out.println(size);
      boolean isMultipleDD=select.isMultiple();
        System.out.println(isMultipleDD);
        /*for (WebElement allMonth:allMonths
             ) {
            String allMonthText=allMonth.getText();
            System.out.println(allMonthText);
        }*/








    }
}
