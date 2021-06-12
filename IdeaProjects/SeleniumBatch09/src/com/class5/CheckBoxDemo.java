package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.stream.ImageInputStream;
import java.util.ArrayList;
import java.util.List;

public class CheckBoxDemo {
    public  static String url="http://syntaxtechs.com/selenium-practice/basic-checkbox-demo.php";
    public static void main(String[] args)
    { System.setProperty("webdriver.chrome.driver","drivers/chromeDriver.exe");

        WebDriver driver=new ChromeDriver();//Launch the browser
        driver.get(url);
        List<WebElement> optionCheckBox=driver.findElements(By.xpath("//input[@class='cb1-element']"));
        System.out.println(optionCheckBox.size());


        for (WebElement optionCheckBoxs:optionCheckBox
             ) {
            String checkBox=optionCheckBoxs.getAttribute("value");

            if (checkBox.equalsIgnoreCase("option-2")){
                optionCheckBoxs.click();
                break;
            }
        }

    }
}
