package com.kodilla;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

public static void main (String [] args ) {
        Calculator calc = new Calculator();
       int a = calc.add(100,35);
       int b = calc.substract(50,150);

   System.out.println(a);
   System.out.println(b);

}
}