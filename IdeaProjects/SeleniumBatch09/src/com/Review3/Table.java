package com.Review3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Table {
    public static void main(String[] args) {
        String url = "https://syntaxtechs.com/selenium-practice/table-search-filter-demo.php";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
       List<WebElement> row=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println(row.size());
        for (WebElement x:row
             ) {
            String text=x.getText();
            System.out.println(text);
        }
        List<WebElement> headerRow= driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
        System.out.println(headerRow.size());
        for (WebElement x:headerRow
        ) {
            String text=x.getText();
            System.out.println(text);
        }
    }
}
