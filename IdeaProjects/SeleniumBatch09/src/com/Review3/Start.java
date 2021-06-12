package com.Review3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://swagger.io/tools/swaggerhub/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String homePageHandle = driver.getWindowHandle();
        System.out.println(homePageHandle);
        WebElement link1 = driver.findElement(By.xpath("//a[@href='https://bitbar.com/?utm_medium=referral&utm_source=swagger.io&utm_campaign=footer']"));
        link1.click();

        Set<String> allHandles = driver.getWindowHandles();
        Iterator<String> iterator = allHandles.iterator();
        homePageHandle = iterator.next();
        String link1Handle = iterator.next();
        System.out.println(link1Handle);
        driver.switchTo().window(link1Handle);
        WebElement link2 = driver.findElement(By.xpath("//a[@href='https://www.youtube.com/user/BitbarChannel/']"));
        link2.click();
        allHandles= driver.getWindowHandles();
        iterator= allHandles.iterator();
        int handleNum=2;
        String value=null;
        String link2handle = null;
        for (int i = 0; iterator.hasNext(); i++) {
            value= iterator.next();
            if (i==handleNum){
                 link2handle=value;
                System.out.println(link2handle);
                break;
            }

        }
        Thread.sleep(2000);
        driver.switchTo().window(homePageHandle);
        driver.switchTo().window(link2handle);
        driver.switchTo().window(link1Handle);
        driver.close();





    }
}
