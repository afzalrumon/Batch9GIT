package com.class4;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class IListenerDemo implements ITestListener {


    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Starting  test with the name "+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test pass, we take screenshot");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed i will report it");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("It skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
    }
}
