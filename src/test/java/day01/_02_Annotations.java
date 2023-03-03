package day01;

import org.testng.annotations.*;

public class _02_Annotations {

   //BeforeClass ==> This code will be run before the class.
    // @BeforeMethod --> This code will be run before all test annotations
            // @Test --> To write our tests
            // @Test --> To write our tests
    // AfterMethod ==> This code will be run after all test annotations
    //AfterClass --> This code will be run after the class
    // It comes to bigger to smaller.
    // Class is bigger than method.
    // class > method > test !!!!!!!!!!!!

    //when you write before method it will run first before method. Each step before method will work everytime.

    // order line doesn't important to result.

    @BeforeMethod
    public void beforeMethod(){

        System.out.println("Before method is working.");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After method is working.");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("before class is working.");
    }


    @Test
    void test1(){

        System.out.println("Test1 is successful");
    }

    @Test
    void test2(){

        System.out.println("Test2 is successful");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class is working.");
    }

    @BeforeMethod
    public void beforeMethod2(){
        System.out.println("Before method 2 is working.");
    }


}
