package com.Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTableWithPagination {
    public static void main(String[] args) {
        String url = "http://syntaxtechs.com/selenium-practice/table-pagination-demo.php";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement> tableRow= driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
        WebElement nextButton = driver.findElement(By.xpath("//a[@class='next_link']"));
        //nextButton.click();
        //boolean flag=true;
        while(nextButton.isDisplayed()){
            for (WebElement tablero:tableRow
            ) {
                String rowText=tablero.getText();
                if (rowText.contains("Archy J")){
                    //flag=false;
                System.out.println(rowText);
                break;}

            }
            nextButton.click();

        }

    }
}
