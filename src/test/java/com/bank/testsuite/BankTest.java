package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// Ravi's creation

public class BankTest extends TestBase {

    String firstName = null;
    String lastName = null;

    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    AccountPage accountPage = new AccountPage();
    CustomersPage customersPage = new CustomersPage();


    @BeforeTest (groups = {"Regression","Smoke","Sanity"})
    public void setUp(){
        firstName = getRandomString(5);
        lastName = getRandomString(5);
    }

    @Test(priority = 0,groups = {"Regression","Smoke","Sanity"})
    public void bankManagerShouldAddCustomerSuccessfully(){

        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnAddCustomerTab();
        addCustomerPage.enterFirstName(firstName);
        addCustomerPage.enterLastName(lastName);
        addCustomerPage.enterPostcode("HA3 5XL");
        addCustomerPage.clickOnAddCustomerButton();
        Alert alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains("Customer added successfully"));
        alert.accept();
    }

    @Test(priority = 1,groups = {"Smoke","Regression"})
    public void bankManagerShouldOpenAccountSuccessfully(){
        homePage.clickOnHomeBtn();
        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnOpenAccountTab();
        openAccountPage.searchCustomerName();
        openAccountPage.selectCustomerName(firstName +" "+ lastName );
        openAccountPage.selectCurrency("Pound");
        openAccountPage.clickOnProcessButton();
        Alert alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains("Account created successfully "));
        alert.accept();
    }

    @Test(priority = 2,groups = {"Sanity","Regression"})
    public void customerShouldLoginAndLogoutSuccessfully(){

        homePage.clickOnHomeBtn();
        homePage.clickOnCustomerLoginTab();
        customersPage.searcustomerfield();
        customerLoginPage.selectYourName(firstName+" "+lastName);
        customerLoginPage.clickOnLoginButton();
        Assert.assertTrue(accountPage.isLogoutButtonDisplayed());
        accountPage.clickOnLogoutButton();
        Assert.assertTrue(customerLoginPage.isYourNameLabelDisplayed());
    }

    @Test(priority = 3,groups = {"Sanity","Regression"})
    public void customerShouldDepositMoneySuccessfully(){

        homePage.clickOnHomeBtn();
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.selectYourName(firstName+" "+lastName);
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnDepositTab();
        accountPage.enterAmount(100);
        accountPage.clickOnDepositWithdrawButton();
        Assert.assertEquals(accountPage.getErrorSuccessMessage(),"Deposit Successful");
    }

    @Test(priority = 4,groups = {"Smoke","Regression"})
    public void customerShouldWithdrawMoneySuccessfully(){

        homePage.clickOnHomeBtn();
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.selectYourName(firstName+" "+lastName);
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnWithdrawlTab();
        accountPage.enterAmount(50);
        accountPage.clickOnDepositWithdrawButton();
        Assert.assertEquals(accountPage.getErrorSuccessMessage(),"Transaction successful");
    }

    @Test(priority = 5,groups = {"Smoke","Sanity"})
    public void bankManagerShouldDeleteCustomerSuccessfully() throws InterruptedException {

        homePage.clickOnHomeBtn();
        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnCustomerTab();
        customersPage.searchCustomerByName(firstName);
        Thread.sleep(5000);
        customersPage.deleteCustomer();
        Thread.sleep(5000);
    }

}
