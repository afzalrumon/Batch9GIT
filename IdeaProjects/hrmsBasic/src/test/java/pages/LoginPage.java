package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginPage extends CommonMethods {
    @FindBy(id="txtUsername")
   public WebElement userName;
    @FindBy(id="txtPassword")
   public WebElement passWord;
    @FindBy(id="btnLogin")
   public WebElement loginBtn;
    @FindBy(id="spanMessage")
    public WebElement errorMsg;
   public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public void logIn(String username,String password){
        sendText(userName, ConfigReader.getPropertyValue("username"));
        sendText(passWord, ConfigReader.getPropertyValue("password"));
        click(loginBtn);
    }

}
