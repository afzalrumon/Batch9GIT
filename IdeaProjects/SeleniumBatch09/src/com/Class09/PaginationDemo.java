package com.Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PaginationDemo {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        WebElement PIM = driver.findElement(By.id("menu_pim_viewPimModule"));
        PIM.click();
        Thread.sleep(1000);
        WebElement addEmployee = driver.findElement(By.id("menu_pim_addEmployee"));
        addEmployee.click();
        Thread.sleep(2000);
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        firstNameField.sendKeys("Aaaaaaaaaaa");
        WebElement lastNameField = driver.findElement(By.id("lastName"));
        lastNameField.sendKeys("Nasdasdasdasfa");

        WebElement empIdField = driver.findElement(By.id("employeeId"));
        String empId = empIdField.getAttribute("value");

        WebElement saveButton = driver.findElement(By.id("btnSave"));
        saveButton.click();
        WebElement employeeListButton = driver.findElement(By.linkText("Employee List"));
        employeeListButton.click();


        boolean flag = true;
        while(flag) {
            List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id = 'resultTable']/tbody/tr"));
            for(int i = 0; i < tableRows.size(); i++) {
                String rowText = tableRows.get(i).getText();
                if(rowText.contains(empId)) {
                    flag = false;
                    WebElement checkbox = driver.findElement(By.xpath("//table[@id = 'resultTable']/tbody/tr[" + i + "]/td[1]"));
                    checkbox.click();
                    WebElement deleteButton = driver.findElement(By.id("btnDelete"));
                    deleteButton.click();
                    //Thread.sleep(2000);
                    WebElement confirmDelete = driver.findElement(By.id("dialogDeleteBtn"));
                    Thread.sleep(1000);
                    confirmDelete.click();
                    tableRows = driver.findElements(By.xpath("//table[@id = 'resultTable']/tbody/tr"));
                    break;
                }
            }
            WebElement next = driver.findElement(By.linkText("Next"));
            next.click();}

    }
}
