package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommand {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromeDriver.exe");

        WebDriver driver=new ChromeDriver();//Launch the browser
        driver.get("http://syntaxtechs.com/selenium-practice/basic-radiobutton-demo.php");
        WebElement ageRadioButtom= driver.findElement(By.cssSelector("input[value='0 - 5']"));
       boolean isRadioByttonEnabled= ageRadioButtom.isEnabled();
       if(!isRadioByttonEnabled){
           System.out.println("disabled");
       }
        System.out.println(isRadioByttonEnabled);
       boolean isAgeRadioButtomdisblayed= ageRadioButtom.isDisplayed();
        System.out.println(isAgeRadioButtomdisblayed);
        boolean isRadioButtonSelected=ageRadioButtom.isSelected();
        System.out.println("Before clicking "+isRadioButtonSelected);
        ageRadioButtom.click();
        isRadioButtonSelected=ageRadioButtom.isSelected();
        System.out.println("After clicking "+isRadioButtonSelected);
    }
}
