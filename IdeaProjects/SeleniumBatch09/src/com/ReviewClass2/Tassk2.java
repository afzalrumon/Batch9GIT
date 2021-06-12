package com.ReviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tassk2 {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://material-ui.com/components/radio-buttons/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement> gender = driver.findElements(By.xpath("//input[@name='gender1']"));
        for (WebElement r : gender
        ) {
            String value = r.getAttribute("value");
            if (value.equalsIgnoreCase("Male")) {

                r.click();
                if (!r.isEnabled()) {
                    System.out.println(value);
                }
            }

        }


    }
}
