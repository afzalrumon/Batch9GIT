package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HAndlingMultiPLeDropdown {
    public  static String url="http://syntaxtechs.com/selenium-practice/basic-select-dropdown-demo.php"; public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromeDriver.exe");

        WebDriver driver=new ChromeDriver();//Launch the browser
        driver.get(url);
        WebElement statesdd= driver.findElement(By.id("multi-select"));
        Select select=new Select(statesdd);
        select.isMultiple();
        boolean isMultiple= select.isMultiple();
        System.out.println(isMultiple);
        if(isMultiple){
          List<WebElement> option= select.getOptions();
            for (WebElement options:option) {
                String s=options.getText();
                select.selectByVisibleText(s); }}
        //select.deselectByIndex(5);
        select.deselectAll(); }
}
