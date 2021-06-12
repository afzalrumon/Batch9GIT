package com.Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethod;

import java.util.List;

public class Task4 extends CommonMethod {
    public static void main(String[] args) throws InterruptedException {


        setUpWithSpeceficUrl("http://www.uitestpractice.com/");
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        WebElement doubleClick = driver.findElement(By.xpath("//button[@name='dblClick']"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggable, droppable).perform();
        actions.doubleClick(doubleClick).perform();
        driver.switchTo().alert().accept();
        driver.switchTo().frame("iframe_a");
        WebElement enterText = driver.findElement(By.id("name"));
        enterText.sendKeys("Afzal rumon");
        driver.switchTo().defaultContent();
        WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
        home.click();
        WebElement deleteBtn = driver.findElement(By.xpath("//button[text()='DELETE']"));
        List<WebElement> lastName = driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td[2]"));
        for (WebElement last : lastName
        ) {
            deleteBtn = driver.findElement(By.xpath("//button[text()='DELETE']"));
            String text = last.getText();
            if (text.equalsIgnoreCase("kumar")) {
                deleteBtn.click();
                WebElement confirmDelete = driver.findElement(By.xpath("//input[@value='Delete']"));
                confirmDelete.click();
                break;
            }
        }
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement ajaxCall = driver.findElement(By.xpath("//a[text()='AjaxCall']"));
        wait.until(ExpectedConditions.elementToBeClickable(ajaxCall));
        ajaxCall.click();
        Thread.sleep(2000);
     /*   driver.switchTo().frame("ad_iframe");

        WebElement add1 = driver.findElement(By.xpath("//div[@id='dismiss-button']"));
        add1.click();
        driver.switchTo().defaultContent();*/
        WebElement ajaxCallLink = driver.findElement(By.xpath("//a[text()='This is a Ajax link']"));
        wait.until(ExpectedConditions.elementToBeClickable(ajaxCallLink));
        ajaxCallLink.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ContactUs']")));
        WebElement linkTextLocator = driver.findElement(By.xpath("//div[@class='ContactUs']"));
        String linkText = linkTextLocator.getText();
        System.out.println(linkText);


        tearDown();
    }
}
