package com.class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {
    public static void main(String[] args) {
        String url = "http://demo.guru99.com/test/simple_context_menu.html";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement rightClick= driver.findElement(By.xpath("//*[text()='right click me']"));
        Actions actions=new Actions(driver);
        actions.contextClick(rightClick).perform();
        WebElement edit= driver.findElement(By.xpath("//span[text()='Edit']"));
        // edit.click();
        actions.click(edit).perform();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        alert.getText();
        actions.doubleClick();

    }
}
