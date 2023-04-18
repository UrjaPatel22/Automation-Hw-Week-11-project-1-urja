package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {


    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }


//    1. UserShouldNavigateToRegisterPageSuccessfully



    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully() {
        //* click on the ‘Register’ link

        WebElement register = driver.findElement(By.className("ico-register"));
        register.click();


        //* Verify the text ‘Register’

WebElement actualTextElement = driver.findElement(By.className("page-title"));
String actualMessage = actualTextElement.getText();
String expectedMessage = "Register";
        Assert.assertEquals("Error Message",expectedMessage,actualMessage);


    }

//    2. userShouldRegisterAccountSuccessfully



    @Test
    public void userShouldRegisterAccountSuccessfully() {


//   click on the ‘Register’ link
        WebElement register = driver.findElement(By.className("ico-register"));
        register.click();

//* Select gender radio button

        WebElement gender = driver.findElement(By.id("gender-female"));
        gender.click();

        //* Enter First name
        driver.findElement(By.id("FirstName")).sendKeys("smith");


//* Enter Last name
        driver.findElement(By.id("LastName")).sendKeys("john");

//* Select Day Month and Year

        WebElement dateOfBirthday = driver.findElement(By.name("DateOfBirthDay"));
        dateOfBirthday.sendKeys("5");


        WebElement dateOfMonth = driver.findElement(By.name("DateOfBirthMonth"));
        dateOfMonth.sendKeys("9");


        WebElement dateOfYear = driver.findElement(By.name("DateOfBirthYear"));
        dateOfYear.sendKeys("1997");

//* Enter Email address
        driver.findElement(By.id("Email")).sendKeys("john@123gmail.com");

//* Enter Password


        driver.findElement(By.id("Password")).sendKeys("john123");


//* Enter Confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("john123");

        //* Click on REGISTER button
        WebElement registerButton = driver.findElement(By.id("register-button"));
        registerButton.click();


//* Verify the text 'Your registration completed

        WebElement actualTextElement = driver.findElement(By.className("result"));
        String actualMessage = actualTextElement.getText();
        String expectedMessage = "Your registration completed";
        Assert.assertEquals("Register not successfully",expectedMessage,actualMessage);



    }
    @After
    public void tearDown(){
        closeBrowser();
    }




}
