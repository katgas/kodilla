package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        double addition = calculator.addAToB(3,7);
        double subtraction = calculator.subtractAFromB(5,20);
        double division = calculator.divideAByB(40,5);
        double multiplication = calculator.multiplyAByB(2,18);

        if ((addition == 10) && (subtraction == 15)) {
            System.out.println("Calculator test OK");
        } else {
            System.out.println("Calculator has error!");
        }
        if ((division == 8) && (multiplication == 36)) {
            System.out.println("Calculator test OK");
        } else {
            System.out.println("Calculator has error!");
        }
    }
}
