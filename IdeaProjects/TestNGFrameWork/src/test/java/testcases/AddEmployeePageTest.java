package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AddEmployeePage;
import pages.DashboardPage;
import pages.EmployeeListPage;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Constants;
import utils.ExcelReading;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AddEmployeePageTest extends CommonMethods {
    @Test
    public void addEmployee() {
        LoginPage loginPage = new LoginPage();
        loginPage.logIn(ConfigReader.getPropertyValue("username"), ConfigReader.getPropertyValue("password"));
        DashboardPage dash = new DashboardPage();
        click(dash.pimOption);
        click(dash.addEmployeeButton);
        AddEmployeePage add = new AddEmployeePage();
        sendText(add.firstName, "Afzal2");
        sendText(add.lastName, "Rumon1");
        click(add.saveBtn);

    }

    @Test(groups = "test")
    public void addMultipleEmployee() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.logIn(ConfigReader.getPropertyValue("username"), ConfigReader.getPropertyValue("password"));
        DashboardPage dash = new DashboardPage();
        AddEmployeePage addEmployeePage = new AddEmployeePage();
        EmployeeListPage emplist = new EmployeeListPage();
        List<Map<String, String>> newEmployees = ExcelReading.excelInListMap(Constants.TESTDATA_FILEPATH, "Sheet1");
        Iterator<Map<String, String>> it = newEmployees.iterator();
        while (it.hasNext()) {
            click(dash.pimOption);
            click(dash.addEmployeeButton);
            Map<String, String> mapNewEmployee = it.next();
            sendText(addEmployeePage.firstName, mapNewEmployee.get("FirstName"));
            sendText(addEmployeePage.middleName, mapNewEmployee.get("MiddleName"));
            sendText(addEmployeePage.lastName, mapNewEmployee.get("LastName"));
            String employeeIDValue = addEmployeePage.employeeId.getAttribute("value");
            sendText(addEmployeePage.photograph, mapNewEmployee.get("Photograph"));

            //select checkbox
            if (!addEmployeePage.createLoginCheckBox.isSelected()) {
                click(addEmployeePage.createLoginCheckBox);
            }

            //add login credentials for user
            sendText(addEmployeePage.usernamecreate, mapNewEmployee.get("UserName"));
            sendText(addEmployeePage.userpassword, mapNewEmployee.get("Password"));
            sendText(addEmployeePage.repassword, mapNewEmployee.get("Password"));
            click(addEmployeePage.saveBtn);

            //navigate  to the employee list
            click(dash.pimOption);
            click(dash.employeeListOption);

            //enter employee id
            waitForClickablity(emplist.idEmployee);
            sendText(emplist.idEmployee, employeeIDValue);
            click(emplist.searchButton);

            List<WebElement> rowData = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
            SoftAssert softAssert = new SoftAssert();
            for (int i = 0; i < rowData.size(); i++) {
                System.out.println("I am inside the loop");
                String rowText = rowData.get(i).getText();
                System.out.println(rowText);
                Thread.sleep(10000);
                String expectedEmployeeDetails = employeeIDValue + " " + mapNewEmployee.get("FirstName") + " " + mapNewEmployee.get("MiddleName") + " " + mapNewEmployee.get("LastName");
                softAssert.assertEquals(rowText, expectedEmployeeDetails);

            }
            softAssert.assertAll();
        }
    }

}

