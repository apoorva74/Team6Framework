package bestbuyTests;

import commonAPI.CommonAPIApoorva;
import home.MainBestBuy;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.css.sac.ElementSelector;

import java.util.List;


public class BestBuy extends CommonAPIApoorva {


        @Test

        public void homepageTesting() {

            CommonAPIApoorva.launchBrowser("https://www.bestbuy.com");

            //Test 2 - closing PopUp Window
            // wait for the close button to appear
            home.MainBestBuy.closePopUp();

           //Test 3 - Testing scrollbar - scrolling down
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollDown();
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollDown();
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollDown();
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollDown();
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollDown();
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollDown();
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollDown();

            //Test 4 - Testing scrollbar - Scrolling up
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollUp();
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollUp();
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollUp();
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollUp();
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollUp();
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollUp();
            home.MainBestBuy.sleep();
            home.MainBestBuy.scrollUp();
        }

    @Test //Test 5 - view account
public void testAccount() throws InterruptedException {
            Driver.get("https://bestbuy.com");
            home.MainBestBuy.closePopUp();
            //Test 6 - open account
            home.MainBestBuy.account();
            //Test 7 - navigate to create Account
            home.MainBestBuy.accountButton();
            //Test 8 - create account
             home.MainBestBuy.createAccount();
    }

    @Test
    public void testSignIn() throws InterruptedException {
        Driver.get("https://bestbuy.com");
        home.MainBestBuy.closePopUp();
        home.MainBestBuy.account();
        //Test 9 - go to sign in page
        home.MainBestBuy.signInButton();
        //Test 10 - sign in
        home.MainBestBuy.signIn();
    }

    @Test
    public void product() {

        Driver.get("https://bestbuy.com");
        home.MainBestBuy.closePopUp();
        //Test 11 - go to product
        home.MainBestBuy.sleep();
        Driver.findElement(By.cssSelector("a#menu0")).click();
        home.MainBestBuy.sleep();
        //Test 12 - close product
        Driver.findElement(By.xpath("//*[@id='group0']/div[3]/a")).click();
        //open products again
        Driver.findElement(By.cssSelector("a#menu0")).click();
        //Test 13 - print all featured items
        home.MainBestBuy.featuredItems();
        //Test 14 - print all categories items
        home.MainBestBuy.allCategories();
        //Test 15 - print featured offer
        //Test 16 - navigate to featured offers
        home.MainBestBuy.featuredOffers();
    }

    //---------------------------------

    @Test //test3
    public void Searchbar(){
       // Actions actions = new Actions(Driver);
        Driver.get("https://bestbuy.com");
        home.MainBestBuy.closePopUp();
        //Test 17 - locate search bar
        Driver.findElement(By.xpath("//*[@id=\"gh-search-input\"]"));
        //Test 18 - enter value to search bar
        Driver.findElement(By.xpath("//*[@id=\"gh-search-input\"]")).sendKeys("laptop",Keys.ENTER);
        home.MainBestBuy.sleep();
        //Test 19 - clear search
        Driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[2]/div[2]/form/button[1]")).click();
        Driver.findElement(By.xpath("//*[@id=\"gh-search-input\"]")).sendKeys("laptop",Keys.ENTER);
        home.MainBestBuy.sleep();
        //Test 20 - Search laptop
        Driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[2]/div[2]/form/button[2]")).click();

        home.MainBestBuy.sleep();
       //Driver.findElements(By.xpath("/html/body/header/div[1]/div[2]/div[2]/form/button[2]"));
       // actions.moveToElement(By.cssSelector("/#header > div:nth-child(2) > div.primary-wrap > div.search-bar > form > button.header-search-button")).click().build().perform();
        //Test 21 - navigate back to home Screen
        Driver.navigate().back();
        //Test 22 - refresh page
        Driver.navigate().refresh();
        //Test 23 -navigate forward
        Driver.navigate().forward();
        // Test 24 - navigate forward and clear search
        Driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[2]/div[2]/form/button[1]")).click();
        Driver.navigate().refresh();

        }
@Test
    public void myBestBuy() {
    Driver.get("https://www.bestbuy.com");
    home.MainBestBuy.closePopUp();
    //Test 25 - navigate to My best buy page
    Driver.findElement(By.xpath("//*[@id=\"footer\"]/div[2]/div[1]/div[1]/div[1]/a")).click();
    home.MainBestBuy.sleep();
    //Test 26 - go back to best buy page
    Driver.navigate().back();
    home.MainBestBuy.sleep();
    //Test 27 print all my best buy options
    home.MainBestBuy.myBestBuy();
    //Test 28 - navigate to view points and certificate page
    Driver.findElement(By.xpath("//*[@id=\"footer\"]/div[2]/div[1]/div[1]/div[1]/ul/li[1]/a")).click();
    //Test 29 - go back to best buy page
    Driver.navigate().back();
    home.MainBestBuy.sleep();
    //Test 30 - navigate to view Member offer page
    Driver.findElement(By.xpath("//*[@id=\"footer\"]/div[2]/div[1]/div[1]/div[1]/ul/li[2]/a")).click();
    //Test 31 - go back to best buy page
    Driver.navigate().back();
    home.MainBestBuy.sleep();
    //Test 32 - navigate to sign in or create account page
    Driver.findElement(By.xpath("//*[@id=\"footer\"]/div[2]/div[1]/div[1]/div[1]/ul/li[3]/a")).click();
    //Test 33 - go back to best buy page
    Driver.navigate().back();
    home.MainBestBuy.sleep();

}
@Test

public void creditCard(){
    Driver.get("https://www.bestbuy.com");
    home.MainBestBuy.closePopUp();
    //Test 34 - print all credit card options
    home.MainBestBuy.creditCard();
    //Test 35 - navigate to credit card page
    Driver.findElement(By.xpath("//*[@id=\"footer\"]/div[2]/div[1]/div[1]/div[2]/a")).click();
    //Test 36 - go back to best buy page
    Driver.navigate().back();
    home.MainBestBuy.sleep();
    //Test 37 - navigate to make payment page
    Driver.findElement(By.xpath("//*[@id=\"footer\"]/div[2]/div[1]/div[1]/div[2]/ul/li[1]/a")).click();
    //Test 38 - go back to best buy page
    Driver.navigate().back();
    home.MainBestBuy.sleep();
    //Test 39 - navigate to credit card offers page
    Driver.findElement(By.xpath("//*[@id=\"footer\"]/div[2]/div[1]/div[1]/div[2]/ul/li[2]/a")).click();
    //Test 40 - go back to best buy page
    Driver.navigate().back();
    home.MainBestBuy.sleep();
    //Test 41 - navigate to apply now page
    Driver.findElement(By.xpath("//*[@id=\"footer\"]/div[2]/div[1]/div[1]/div[2]/ul/li[3]/a")).click();
    //Test 42 - go back to best buy page
    Driver.navigate().back();
    home.MainBestBuy.sleep();
}

@AfterMethod
    public static void  close(){

        Driver.get("https://www.Bestbuy.com");
        Driver.close();

}
}





