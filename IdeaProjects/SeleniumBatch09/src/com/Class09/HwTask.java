package com.Class09;

import com.Class8.ExplicitWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HwTask {
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
        WebDriverWait explicitWait = new WebDriverWait(driver, 20);
        Thread.sleep(2000);

        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='menu_leave_viewLeaveModule']")));
        WebElement leaveButton = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));

        leaveButton.click();
        //leaveButton.click();
        //WebDriverWait explicitWait=new WebDriverWait(driver,20);
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("calFromDate")));
        WebElement calender = driver.findElement(By.id("calFromDate"));
        calender.click();
        WebElement monthDD = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select = new Select(monthDD);
        select.selectByVisibleText("Jul");
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td")));
        List<WebElement> datesPickFrom = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement dates : datesPickFrom
        ) {
            String dateText = dates.getText();
            System.out.println(dateText);
            if (dateText.contains("10")) {

                dates.click();
                break;
            }
        }
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("calToDate")));
        WebElement calenderTo = driver.findElement(By.id("calToDate"));
        calenderTo.click();
        WebElement monthDDTo = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select1 = new Select(monthDDTo);
        select1.selectByVisibleText("Aug");
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td")));
        List<WebElement> datesPickTo = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement dates : datesPickTo
        ) {
            String dateText = dates.getText();
            // System.out.println(dateText);
            if (dateText.contains("9")) {

                dates.click();
                break;
            }

        }
        List<WebElement> leaveStatus = driver.findElements(By.xpath("//div[@id='leaveList_chkSearchFilter_checkboxgroup']/label"));
        for (WebElement leaveSts : leaveStatus
        ) {
            String text = leaveSts.getText();
            if (text.contains("Cancelled") || text.contains("Rejected")) {
                leaveSts.click();
            }
            if (text.contains("Pending Approval")) {
                leaveSts.click();
            }
        }
        WebElement subUnit = driver.findElement(By.xpath("//select[@id='leaveList_cmbSubunit']"));
        Select subUnitDD = new Select(subUnit);
        subUnitDD.selectByVisibleText("IT Support");
        WebElement searchButton = driver.findElement(By.id("btnSearch"));
        searchButton.click();
        driver.quit();

    }


}
