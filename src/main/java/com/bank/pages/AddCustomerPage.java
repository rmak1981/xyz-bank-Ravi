package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
/*
Ravi's Creation
 */
public class AddCustomerPage extends Utility {

    By firstName = By.xpath("//input[@placeholder='First Name']");
    By lastName = By.xpath("//input[@placeholder='Last Name']");
    By postcode = By.xpath("//input[@placeholder='Post Code']");
    By addCustomerBtn = By.xpath("//button[@class='btn btn-default']");

    public void enterFirstName(String fName){ sendTextToElement(firstName, fName);}

    public void enterLastName(String lName){
        sendTextToElement(lastName, lName);
    }

    public void enterPostcode(String postCode){
        sendTextToElement(postcode, postCode);
    }

    public void clickOnAddCustomerButton(){
        clickOnElement(addCustomerBtn);
    }
}
