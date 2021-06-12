package com.Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDemo {
    public static void main(String[] args) {
        String url = "https://jqueryui.com/droppable/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0);
        WebElement draggable= driver.findElement(By.id("draggable"));
        WebElement droppable= driver.findElement(By.id("droppable"));
        Actions actions=new Actions(driver);
        //actions.dragAndDrop(draggable,droppable).perform();
        actions.clickAndHold(draggable).moveToElement(droppable).release().build().perform();

    }
}
