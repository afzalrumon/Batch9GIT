package com.class03;

import org.testng.annotations.*;

public class Class1 {

    @BeforeTest
    public void f() {
        System.out.println("Before");
    }
    @AfterTest
    public void g() {
        System.out.println("After");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before methode");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after methode");
    }

    @Test
    public void d() {
        System.out.println("hello");
    }

    @Test
    public void a() {
        System.out.println("hello");
    }


}
