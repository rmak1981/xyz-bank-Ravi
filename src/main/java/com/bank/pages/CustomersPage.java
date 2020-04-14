package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/*
Ravi's Creation
 */
public class CustomersPage extends Utility {

    By searchCustomer = By.id("userSelect");
    By deleteBtn = By.xpath("//td[contains(text(),'Delete Customer')]");


    public void searcustomerfield(){clickOnElement(searchCustomer);}

    public void searchCustomerByName(String firstName){
        sendTextToElement(searchCustomer, firstName);
    }


    public void deleteCustomer(){
        clickOnElement(deleteBtn);
    }
}
