package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup(){
        openBrowser(baseUrl);
    }
//    1. userShouldNavigateToComputerPageSuccessfully
//* click on the ‘Computers’ Tab

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        WebElement computers = driver.findElement(By.linkText("Computers"));
        computers.click();


        //* Verify the text ‘Computers’
        WebElement actualTextElement = driver.findElement(By.className("page-title"));
        String actualMessage = actualTextElement.getText();
        String expectedMessage = "Computers";
        Assert.assertEquals(" Computers Text is not matching  ", expectedMessage, actualMessage);
    }

//    2. userShouldNavigateToElectronicsPageSuccessfully

//* Verify the text ‘Electronics’

@Test
public void userShouldNavigateToElectronicsPageSuccessfully(){
    //* click on the ‘Electronics’ Tab

    WebElement electronics = driver.findElement(By.linkText("Electronics"));
    electronics.click();

    WebElement actualTextElement = driver.findElement(By.className("page-title"));
    String actualMessage = actualTextElement.getText();
    String expectedMessage = "Electronics";
    Assert.assertEquals(" Electronics Text is not matching  ", expectedMessage, actualMessage);
}
//3.userShouldNavigateToApparelPageSuccessfully




    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        //* click on the ‘Apparel’ Tab

        WebElement apparel = driver.findElement(By.linkText("Apparel"));
        apparel.click();
//* Verify the text ‘Apparel’
        WebElement actualTextElement = driver.findElement(By.className("page-title"));
        String actualMessage = actualTextElement.getText();
        String expectedMessage = "Apparel";
        Assert.assertEquals(" Apparel Text is not matching  ", expectedMessage, actualMessage);


    }
//4.userShouldNavigateToDigitalDownloadsPageSuccessfull
//* click on the ‘Digital downloads’ Tab
//* Verify the text ‘Digital downloads’


    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {

        //* click on the ‘Digital downloads’ Tab
        WebElement digitalDownloads = driver.findElement(By.linkText("Digital downloads"));
        digitalDownloads.click();

        WebElement actualTextElement = driver.findElement(By.className("page-title"));
        String actualMessage = actualTextElement.getText();
        String expectedMessage = "Digital downloads";
        Assert.assertEquals(" Digital downloads  Text is not matching  ", expectedMessage, actualMessage);

    }
//        5. userShouldNavigateToBooksPageSuccessfully
        @Test
                public void userShouldNavigateToBooksPageSuccessfully(){
         //* click on the ‘Books’Tab
            WebElement books  = driver.findElement(By.linkText("Books"));
            books.click();

            //Verify the Books
            WebElement actualTextElement = driver.findElement(By.className("page-title"));
            String actualMessage = actualTextElement.getText();
            String expectedMessage = "Books";
            Assert.assertEquals(" Books Text is not matching  ", expectedMessage, actualMessage);
        }



//        6. userShouldNavigateToJewelryPageSuccessfully




    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //* click on the ‘Jewelry’ Tab
        WebElement jewelry  = driver.findElement(By.linkText("Jewelry"));
        jewelry.click();

//* Verify the text ‘Jewelry’
        WebElement actualTextElement = driver.findElement(By.className("page-title"));
        String actualMessage = actualTextElement.getText();
        String expectedMessage = "Jewelry";
        Assert.assertEquals(" Jewelry Text is not matching  ", expectedMessage, actualMessage);
    }


//7. userShouldNavigateToGiftCardsPageSuccessfully


@Test
public void userShouldNavigateToGiftCardsPageSuccessfully(){
    //* click on the ‘Gift Cards’ Tab
    WebElement giftCards  = driver.findElement(By.linkText("Gift Cards"));
    giftCards.click();
    //* Verify the text ‘Gift Cards’
    WebElement actualTextElement = driver.findElement(By.className("page-title"));
    String actualMessage = actualTextElement.getText();
    String expectedMessage = "Gift Cards";
    Assert.assertEquals(" Gift Cards Text is not matching  ", expectedMessage, actualMessage);


}



    @After
    public void tearDown(){
         closeBrowser();
    }


}
