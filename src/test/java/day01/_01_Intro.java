package day01;

import org.testng.annotations.Test;

public class _01_Intro {
 //   public static void main(String[] args) {

        // go to the page
        // login
        // add to cart
        // check out

 //   }

        // If you don't give the order it runs the tests in  alphabetical order.
    @Test
    public void test1(){
        System.out.println("Test 1 has passes");
    }

    @Test (priority = 1)
    public void loginTest(){
        System.out.println("Login test is successful.");
    }

    @Test (priority = 2)
    public void addToCart(){
        System.out.println("Add to cart is successful.");
    }
    @Test (priority = 3)
    public void checkOut(){
        System.out.println("Check out is successful");
    }
}
