package com.class03;

import org.testng.annotations.*;

public class Task1 {
    /*Task 1: Executing different test based TestNG annotations
    Create class that will have:
    Before and After Class annotation
    Before and After Method annotation
2 methods with Test annotation*/
    @BeforeClass
    public void aClass(){
        System.out.println("Opened");
    }
    @AfterClass
    public void bClass(){
        System.out.println("Closed");
    }
    @BeforeMethod
    public void Bmethod(){
        System.out.println("Opened");
    }
    @AfterMethod
    public void Amethod(){
        System.out.println("Closed");
    }
    @Test
    public void a(){
        System.out.println("Test a");
    }
    @Test
    public void b(){
        System.out.println("Test b");
    }

    @Test
    public void c(){
        System.out.println("Test c");
    }
}
