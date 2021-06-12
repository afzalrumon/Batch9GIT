package com.Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ActionClass {
    public static String url = "https://www.amazon.com/?tag=hymsabk-20&ref=pd_sl_9lq5vwx8qf_e&adgrpid=1345802803306286&hvadid=84112747242549&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=60165&hvtargid=kwd-84113033037108:loc-190&hydadcr=28884_11845482";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement accountAndLists= driver.findElement(By.id("nav-link-accountList"));
        Actions action=new Actions(driver);
        action.moveToElement(accountAndLists).perform();


    }
}
