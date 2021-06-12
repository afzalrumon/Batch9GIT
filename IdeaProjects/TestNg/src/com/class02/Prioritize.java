package com.class02;

import org.testng.annotations.Test;

public class Prioritize {
    @Test(priority  =2)
    public void firstMethod(){
        System.out.println("first");
    }
    @Test(priority = 1)
    public void secondMethod(){
        System.out.println("second");
    }
    @Test(priority = 3)
    public void thirdMethod(){
        System.out.println("Third");
    }
}
