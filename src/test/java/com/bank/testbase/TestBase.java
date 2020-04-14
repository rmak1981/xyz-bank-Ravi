package com.bank.testbase;

import com.bank.browserselector.BrowserSelector;
import com.bank.loadproperty.LoadProperty;
import com.bank.utility.Utility;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;
/*
Ravi's Creation
 */
public class TestBase extends Utility {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String baseURL = loadProperty.getProperty("baseURL");
    String browser = loadProperty.getProperty("browser");


    @BeforeTest(groups = {"Regression","Smoke","Sanity"})
    public void openBrowser(){
        browserSelector.selectBrowser(browser);
       // driver.manage().window().setPosition(new Point(-2000, 0));//display into second screen
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseURL);
    }

    @AfterTest(groups = {"Regression","Smoke","Sanity"})
    public void tearDown(){
        driver.quit();
    }



}
