package com.Hw;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static void main(String[] args) {
       /* Open chrome browser
        Go to “http://18.232.148.34/humanresources/symfony/web/index.php/auth/login”
        Enter valid username and password (username - Admin, password - Hum@nhrm123)
        Click on login button
        Then verify Syntax Logo is displayed.*/
        System.setProperty("webdriver.chrome.driver","drivers/chromeDriver.exe");

        WebDriver driver=new ChromeDriver();//Launch the browser
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userNameTextBox=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userNameTextBox.sendKeys("Admin");
       WebElement  passWordTextBox= driver.findElement(By.cssSelector("input[id*='txtPassword']"));
       passWordTextBox.sendKeys("Hum@nhrm123");
       WebElement clickButton= driver.findElement(By.id("btnLogin"));
       clickButton.click();
       WebElement syntaxLogo=driver.findElement(By.cssSelector("img[src='/humanresources/symfony/web/webres_5acde3dbd3adc6.90334155/themes/default/images/syntax.png']"));
      boolean isLogoDisplayed=syntaxLogo.isDisplayed();
      if(!isLogoDisplayed){
          System.out.println("Not Displayed");
      }else{
          System.out.println("Displayed");
      }






    }
}
