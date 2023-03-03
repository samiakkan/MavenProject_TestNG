package day04;

import org.testng.annotations.*;

public class _01_XMLIntro {

    /*
     @BeforeSuit
       @BeforeTest
         @BeforeGroup
           @BeforeClass // runs before every class annotation
             @BeforeMethod // runs before every @Test annotation
                 @Test1 method  // we write our tests
                 @Test2 method
             @AfterMethod // runs after every @Test annotation
           @AfterClass // runs after every class annotation
         @AfterGroup
       @AfterTest
     @AfterSuit
   */

    @BeforeSuite
    void beforeSuiteMethod(){
        System.out.println("Before suits runs");
    }

    @BeforeTest
    void beforeTestMethod(){
        System.out.println("Before Test runs");
    }

    @BeforeGroups
    void beforeGroupsMethod(){
        System.out.println("Before Groups Runs");
    }

    @BeforeClass
    void beforeClassMethod(){
        System.out.println("Before class runs");
    }

    @BeforeMethod
    void beforeMethodMethod(){
        System.out.println("Before method runs");
    }

    @Test
    void Test1(){
        System.out.println("Test 1 runs");
    }

    @Test
    void Test2(){
        System.out.println("Test 2 runs");
    }

    @AfterMethod
    void afterMethodMethod(){
        System.out.println("After method runs");
    }

    @AfterClass
    void afterClassMethod(){
        System.out.println("After class runs");
    }

    @AfterGroups
    void afterGroupMethod(){
        System.out.println("After group runs");
    }

    @AfterTest
    void afterTestMethod(){
        System.out.println("After test runs");
    }

    @AfterSuite
    void afterSuiteMethod(){
        System.out.println("After suite runs");
    }
}
