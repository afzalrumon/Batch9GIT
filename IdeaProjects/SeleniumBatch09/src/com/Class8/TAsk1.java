package com.Class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TAsk1 {
    public static void main(String[] args) {
        String url = "http://syntaxtechs.com/selenium-practice/dynamic-elements-loading.php";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement button = driver.findElement(By.id("startButton"));

        button.click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@style='padding: 10%;']")));
        WebElement textDisplay = driver.findElement(By.xpath("//h4[@style='padding: 10%;']"));
        System.out.println(textDisplay.getText());
        //driver.quit();


    }
}
