package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.navigate().to("https://practicetestautomation.com/");
    }
    @Test
    public void verifyThatUserCanLogin(){
        homePage.clickOnPracticeButton();
        practicePage.clickOnTestloginPageButton();

        loginPage.inputUsername("student");
        loginPage.inputPassword("Password123");
        loginPage.clickOnSubmitButton();


        Assert.assertTrue(profilePage.getMessage().isDisplayed());
        Assert.assertTrue(profilePage.getLogoutButton().isDisplayed());



    }
    @Test
    public void verifyThatUserCannotLoginWithInvalidUsername(){

        homePage.clickOnPracticeButton();
        practicePage.clickOnTestloginPageButton();
        loginPage.inputUsername("incorrectUser");
        loginPage.inputPassword("Password123");
        loginPage.clickOnSubmitButton();

        Assert.assertTrue(loginPage.getError().isDisplayed());



    }
    @Test
    public void verifyThatUserCannotLoginWithInvalidPassword(){

        homePage.clickOnPracticeButton();
        practicePage.clickOnTestloginPageButton();
        loginPage.inputUsername("student");
        loginPage.inputPassword("incorrectPassword");
        loginPage.clickOnSubmitButton();





    }
    @Test
    public void verifyThatUserCannotLoginIfUsernameFieldIsEmpty(){

        homePage.clickOnPracticeButton();
        practicePage.clickOnTestloginPageButton();
        loginPage.inputUsername(" ");
        loginPage.inputPassword("Password123");
        loginPage.clickOnSubmitButton();



    }
    @Test
    public void verifyThatUsercannotLoginIfPassworFieldIsEmpty(){

        homePage.clickOnPracticeButton();
        practicePage.clickOnTestloginPageButton();
        loginPage.inputUsername("student");
        loginPage.inputPassword(" ");
        loginPage.clickOnSubmitButton();



    }
    @Test
    public void verifyThatUserCannotLoginIfUsernameAndPasswordFieldsAreEmpty(){

        homePage.clickOnPracticeButton();
        practicePage.clickOnTestloginPageButton();
        loginPage.inputUsername(" ");
        loginPage.inputPassword(" ");
        loginPage.clickOnSubmitButton();


    }
    @Test
    public void userCanLogin(){

    }
}


