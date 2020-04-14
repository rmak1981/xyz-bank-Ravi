package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/*
Ravi's Creation
 */
public class BankManagerLoginPage extends Utility {

    By addCustomerTab = By.xpath("//button[contains(text(),'Add Customer')]");
    By openAccountTab = By.cssSelector("body.ng-scope:nth-child(2) div.ng-scope:nth-child(3) div.container-fluid.ng-scope div.ng-scope div.border.box.padT20.ng-scope div.center > button.btn.btn-lg.tab:nth-child(2)");
    By customersTab = By.xpath("//button[3]");

    public void clickOnAddCustomerTab(){ clickOnElement(addCustomerTab);  }

    public void clickOnOpenAccountTab(){ clickOnElement(openAccountTab);  }

    public void clickOnCustomerTab(){
        clickOnElement(customersTab);
    }
}
