package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/*
Ravi's Creation
 */

public class OpenAccountPage extends Utility {

    By customerName = By.id("userSelect");
    By currency = By.id("currency");
    By processBtn = By.xpath("//button[contains(text(),'Process')]");

    public void searchCustomerName(){clickOnElement(customerName);}

    public void selectCustomerName(String strcn){
        selectByVisibleTextFromDropDown(customerName, strcn);
    }

    public void searchCurrencyName(){clickOnElement(currency);}

    public void selectCurrency(String strcurrency){
        selectByVisibleTextFromDropDown(this.currency, strcurrency);
    }

    public void clickOnProcessButton(){
       clickOnElement(processBtn);
    }
}
