package com.ReviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        String url = "https://www.surveymonkey.com/r/?sm=uQNn3rYKMcVS0Dyy6GTjSw%3D%3D";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='211154525']"));
        Select select = new Select(dropDown);
        select.selectByIndex(2);
        select.selectByValue("2657263884");
        select.selectByVisibleText("Answer Choice B");
        List<WebElement> allOptons = select.getOptions();
        for (WebElement allOption : allOptons
        ) {
            String text = allOption.getText();
            System.out.println(text);

        }

    }
}
