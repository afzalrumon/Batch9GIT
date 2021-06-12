package testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginTest extends CommonMethods {
    @Test(groups = "sanity")
    public void adminLogin(){
        LoginPage loginPage=new LoginPage();
        sendText(loginPage.userName, ConfigReader.getPropertyValue("username"));
        sendText(loginPage.passWord, ConfigReader.getPropertyValue("password"));
        click(loginPage.loginBtn);
        //assertion
        DashboardPage dashboardPage=new DashboardPage();
        Assert.assertTrue(dashboardPage.welcomemessage.isDisplayed(),"Welcome msg is not displayed");

    }
    @Test(dataProvider="invalidData",groups = "smoke")
    public void invalidLoginErrorMessageValidation(String username,String password,String message){
      LoginPage loginPage=new LoginPage();
        sendText(loginPage.userName,username);
        sendText(loginPage.passWord,password);
        click(loginPage.loginBtn);

        String actualError=loginPage.errorMsg.getText();
        Assert.assertEquals(actualError,message,"Error message didn't match");
    }
    @DataProvider
    public Object[][] invalidData(){
        Object[][] data={
        {"James","123!","Invalid credentials"},
        {"Admin1","Syntax123!","Invalid credentials"},
        {"James","","Password cannot be empty"},
        {"","Syntax123!","Username cannot be empty"}};
        return data;
    }
}
