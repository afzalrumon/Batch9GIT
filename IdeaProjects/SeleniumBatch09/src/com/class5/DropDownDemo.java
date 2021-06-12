package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class DropDownDemo {
    public  static String url="http://syntaxtechs.com/selenium-practice/basic-select-dropdown-demo.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromeDriver.exe");

        WebDriver driver=new ChromeDriver();//Launch the browser
        driver.get(url);
       WebElement daysDD= driver.findElement(By.id("select-demo"));
       Select select=new Select(daysDD);
    /*   select.selectByIndex(2);
       select.selectByVisibleText("Wednesday");
       select.selectByValue("Sunday");*/

        List<WebElement> allOption=select.getOptions();
        int size=allOption.size();
        System.out.println(size);
        Iterator<WebElement> iterator = allOption.iterator();
        while (iterator.hasNext()){

            System.out.println(iterator.next().getText());

        }

    }
}
