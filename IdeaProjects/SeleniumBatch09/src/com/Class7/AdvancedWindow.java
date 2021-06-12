package com.Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvancedWindow {
    public static void main(String[] args) {
        String url = "http://syntaxtechs.com/selenium-practice/window-popup-modal-demo.php";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainHandle = driver.getWindowHandle();
        WebElement instagramButton = driver.findElement(By.linkText("Follow On Instagram"));
        WebElement facebookButton = driver.findElement(By.linkText("Like us On Facebook"));
        WebElement instagramAndFacebookButtom = driver.findElement(By.linkText("Follow Instagram & Facebook"));
        instagramButton.click();
        driver.manage().window().maximize();
        facebookButton.click();
        instagramAndFacebookButtom.click();
        String text = driver.getTitle();
        System.out.println(text);
        Set<String> allwindowHandles = driver.getWindowHandles();
        System.out.println(allwindowHandles.size());
        /*for (String all:allwindowHandles
             ) {
            driver.switchTo().window(all);
            System.out.println(driver.getTitle());
        }*/
        Iterator<String> iterator = allwindowHandles.iterator();
        while (iterator.hasNext()) {
            String handle = iterator.next();
            if (!handle.equalsIgnoreCase(mainHandle)) {
                driver.switchTo().window(handle);
                System.out.println(driver.getTitle());
                driver.close();

            }
          /*  driver.switchTo().window(handle);
            System.out.println(driver.getTitle());*/
        }
        driver.switchTo().window(mainHandle);
        instagramButton.click();

    }
}
