package day04;

import org.testng.annotations.Test;

public class _03_Groups {

    @Test (groups = "smokeTest")
    void test1(){
        System.out.println("test 1 smokeTest");
    }

    @Test (groups = "RegressionTest")
    void test2(){
        System.out.println("test 2 Regression ");
    }

    @Test (groups = "RegressionTest")
    void test3(){
        System.out.println("Test 3 Regression");
    }

    @Test (groups = "smokeTest")
    void test4(){
        System.out.println("test 4 smokeTest");
    }

    @Test (groups = {"smokeTest", "RegressionTest"})
    void test5(){
        System.out.println("Test 5 both smoke and regression");
    }
}
