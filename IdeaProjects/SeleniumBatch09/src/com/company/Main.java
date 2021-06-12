package com.company;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        /*HW
        navigate to https://parabank.parasoft.com/parabank/register.
        // htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser
        navigate to fb.com
        click on create new account
        fill up all the textboxes
        click on sign up button
        close the pop up
        close the browser*/
        System.out.println("hi");
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver a=new ChromeDriver();

        a.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");



    }
}
