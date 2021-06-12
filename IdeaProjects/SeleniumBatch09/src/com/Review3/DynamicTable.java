package com.Review3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;

public class DynamicTable {
    public static void main(String[] args) throws AWTException {
        String url = "https://syntaxtechs.com/selenium-practice/table-search-filter-demo.php";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement username= driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));
        password.sendKeys("test");
        WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginBtn.click();
        List<WebElement> rows=driver.findElements(By.xpath("//*[@id='ctl00_MainContent_orderGrid']"));
        for (WebElement e:rows
             ) {
            System.out.println(e.getText());
        }
        Robot robot =new Robot();



    }
}
