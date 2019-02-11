package day1;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class coding {

    @Test
    public void test001() {
        System.out.println("Hello, World!");

    }

    @Test
    public void test002() {
        String HelloTest = "Hello, World!";
        System.out.println(HelloTest);

    }

    @Test
    public void test003() {
        String s1 = new String("Who let the dogs out?");
        String s2 = "Who who who who!";

        System.out.println(s1 + " " + s2);
    }

    @Test
    public void test004() {
        int num = 5;
        String s = "I have " + num + " cookies";
        System.out.println(s);

    }

    @Test
    public void test005() {
        boolean b;
        boolean toBe = false;
        b = toBe || !toBe;
        if (b) {
            System.out.println(toBe);
        }

    }

    @Test
    public void test006() {
        boolean isElementVisible = false;

        if (isElementVisible == true) {
            System.out.println("Click on the element");

        } else {
            System.out.println("Element is not visible");
        }
    }

    @Test
    public void test0061() {
        byte zero = 0;
        short a = 3;
        int b = 1;
        char d = ' ';
        float e = 2.0f;
        boolean f = true;

        String s = "H" + a + b + b + zero + d + "w" + zero + "r" + b + "d" + d + e + d + f;
        System.out.println(s);
    }

    @Test
    public void test007() {
        int a = 4;
        boolean b = a == 4;

        if (b) {
            System.out.println("It's true!");
        }
    }

    @Test
    public void test008() {
        boolean elimentAisVisible = true;
        boolean elimentBisVisible = false;

        if (elimentAisVisible && elimentBisVisible) {
            System.out.println("Click Somewhere");
        } else {
            System.out.println("elimentAisVisible:" + elimentAisVisible + " " + "elimentBisVisible:" + elimentBisVisible);
        }
    }


    @Test
    public void test010() {
        int[] arr;
        arr = new int[10];
        arr[0] = 4;
        arr[1] = arr[0] + 5;

        if (arr[1] == 1) {
            System.out.println("Equal to 1");
        } else {
            System.out.println("Not equal to 1");
        }
    }

    @Test
    public void test011() {
        int[] arr = {1, 2, 3, 4, 5};
        if (arr[3] == 3) {
            System.out.println("Equal to 3");
        } else {
            System.out.println("Not equal to 3");
        }
    }

    @Test
    public void test012() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void test013() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int eachElement : arr) {
            System.out.println(eachElement);
        }
    }

    @Test
    public void test014() {
        int[] numbers = {
                951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544,
                615, 83, 165, 237, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941
        };
           for (int i = 0; i < numbers.length; i++)  {
            int element = numbers[i];
            if (element == 237) {
                break;
               }
               if (element % 3 == 0){
                   System.out.println(element);
               }

        }
    }

}