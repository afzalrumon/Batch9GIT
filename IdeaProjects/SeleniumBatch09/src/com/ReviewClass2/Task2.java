package com.ReviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
    public  static String url="https://www.ironspider.ca/forms/checkradio.htm";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement redCheckBox=driver.findElement(By.xpath("//input[@value='red']"));
        boolean redCheckBoxIsEnabled= redCheckBox.isEnabled();

        System.out.println(redCheckBoxIsEnabled);
        boolean redCheckBoxIsSelected =redCheckBox.isSelected();
        System.out.println(redCheckBoxIsSelected);
        Thread.sleep(1000);
        redCheckBox.click();
        Thread.sleep(1000);
        redCheckBoxIsSelected=redCheckBox.isSelected();
        System.out.println(redCheckBoxIsSelected);
        List<WebElement> allOptions= driver.findElements(By.xpath("//input[@type='checkbox']"));
        int size=allOptions.size();
        System.out.println(size);


        for (WebElement all:allOptions
             ) {
           // all.click();


            String text=all.getAttribute("value");

            System.out.println(text);
            if (text.equalsIgnoreCase("yellow")){
                all.click();
                break;
            }
            if (text.equalsIgnoreCase("purple")){
                all.click();
            }

        }

    }
}
