package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup(){
        openBrowser(baseUrl);
    }

    //1. userShouldNavigateToLoginPageSuccessfully
//        * click on the ‘Login’ link
//        * Verify the text ‘Welcome, Please Sign In!’
@Test
    public void userShouldNavigateToLoginPageSuccessfully(){
    WebElement loginLink= driver.findElement(By.className("ico-login"));
    loginLink.click();


   WebElement actualTextElement = driver.findElement(By.className("page-title"));
   String actualMessage = actualTextElement.getText();
    String expectedMessage= "Welcome, Please Sign In!";



}

@Test

//2. userShouldLoginSuccessfullyWithValidCredentials
public void userShouldLoginSuccessfullyWithValidCredentials(){
    //* click on the ‘Login’ link
    WebElement loginLink= driver.findElement(By.className("ico-login"));
    loginLink.click();
//* Enter valid username
    driver.findElement(By.id("Email")).sendKeys("new12345@gmail.com");
    //* Enter valid password
    driver.findElement(By.id("Password")).sendKeys("abcd@1298345");
//* Click on ‘LOGIN’ button


    WebElement loginButton= driver.findElement(By.cssSelector("button.button-1.login-button"));
    loginButton.click();

//* Verify the ‘Log out’ text is display
    WebElement actualTextElement = driver.findElement(By.className("ico-logout"));
    String actualMessage = actualTextElement.getText();
    String expectedMessage= "Log out";

    Assert.assertEquals("Log out text is not displayed ",expectedMessage,actualMessage);
}


//3. verifyTheErrorMessage



//* Verify the error message ‘Login was unsuccessful.
//    Please correct the errors and try again. No customer account found’
@Test
public void verifyTheErrorMessage(){

    //* click on the ‘Login’ link
    WebElement loginLink= driver.findElement(By.className("ico-login"));
    loginLink.click();

    //* Enter invalid username
    driver.findElement(By.id("Email")).sendKeys("prime@123gmail.com");


//* Enter invalid password
    driver.findElement(By.id("Password")).sendKeys("Prime123");

    //* Click on Login button

    WebElement loginButton= driver.findElement(By.cssSelector("button.button-1.login-button"));
    loginButton.click();


    //* Verify the error message ‘Login was unsuccessful.


    String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
            "No customer account found";
    WebElement actualTextElement = driver.findElement(By.cssSelector("div.message-error.validation-summary-errors"));
    String actualMessage = actualTextElement.getText();
    Assert.assertEquals("Error message not displayed", expectedMessage, actualMessage);


    }



@After
    public void tearDown(){
       closeBrowser();
}



}
