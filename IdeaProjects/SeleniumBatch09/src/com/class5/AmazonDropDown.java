package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class AmazonDropDown {
    public static String url="https://www.amazon.com/?tag=amazusnavi-20&hvadid=381823327651&hvpos=&hvnetw=g&hvrand=11667029991180241593&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9005537&hvtargid=kwd-10573980&ref=pd_sl_7j18redljs_e&hydadcr=28883_11845442&gclid=EAIaIQobChMI3JeOst6f8AIVYW1vBB0hHQuLEAAYASAAEgIXvvD_BwE";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromeDriver.exe");

        WebDriver driver=new ChromeDriver();//Launch the browser
        driver.get(url);
        WebElement catgories=driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(catgories);
        List<WebElement> option= select.getOptions();
      /*  for (WebElement op :option
        ) {
            String optionTewxt=op.getText();
            System.out.println(optionTewxt);

        }*/
       boolean isMultiple= select.isMultiple();
        if (!isMultiple){
            List<WebElement> options= select.getOptions();
            Iterator<WebElement> iterator = options.iterator();
            while (iterator.hasNext()){
                String selectedOption=iterator.next().getText();

                select.selectByVisibleText(selectedOption);
                System.out.println(selectedOption);

            }
            }else{
            System.out.println("not MUltiple");
        }


    }
}
