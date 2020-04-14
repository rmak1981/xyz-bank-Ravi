package com.bank.listeners;
/*
Ravi's Creation
Date of Creation :-
*/

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
//        //        System.out.println("My Test Is Fail" + iTestResult.getName());
////        Utility.takeScreenShot();
//        // this will add the screenshot in side our report
//
//        String screenshotName = Utility.takeScreenShot(iTestResult.getName()); // this file name is returning path
//        System.setProperty("org.uncommons.reportng.escape-output", "false");
//        Reporter.log("Click to see screenshot");
//        Reporter.log("<a target = \"_blank\" href="+screenshotName+">Screenshot</a>");
//        Reporter.log("<br>");
//        Reporter.log("<br>");
//        Reporter.log("<a target = \"_blank\" href="+screenshotName+"><img src="+screenshotName+" height=200 width=200></img></a>");
}

    @Override
    public void onTestFailure(ITestResult iTestResult) {//        //        System.out.println("My Test Is Fail" + iTestResult.getName());
////        Utility.takeScreenShot();
//        // this will add the screenshot in side our report
//
//        String screenshotName = Utility.takeScreenShot(iTestResult.getName()); // this file name is returning path
//        System.setProperty("org.uncommons.reportng.escape-output", "false");
//        Reporter.log("Click to see screenshot");
//        Reporter.log("<a target = \"_blank\" href="+screenshotName+">Screenshot</a>");
//        Reporter.log("<br>");
//        Reporter.log("<br>");
//        Reporter.log("<a target = \"_blank\" href="+screenshotName+"><img src="+screenshotName+" height=200 width=200></img></a>");


    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
