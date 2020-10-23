package com.company;

public class NumberType implements MyInteger {

    int x;
    boolean a = true;

    @Override
    public void isEven() {
        if (x / 2 == 0) {
            a = true;
            System.out.println("number is even :" + a);
        } else {
            a = false;
            System.out.println("number is even :" + a);
        }
    }

    @Override
    public void isOdd() {
        if (x / 2 != 0) {
            a = true;
            System.out.println("number is odd :" + a);
        } else {
            a = false;
            System.out.println("number is odd :" + a);
        }
    }

    @Override
    public void isPositive() {
        if (x > 0) {
            a = true;
            System.out.println("number is positive :" + a);
        } else {
            a = false;
            System.out.println("number is positive :" + a);
        }
    }

    @Override
    public void isNegative() {
        if (x < 0) {
            a = true;
            System.out.println("number is negative :" + a);
        } else {
            a = false;
            System.out.println("number is negative :" + a);
        }
    }

    @Override
    public void isZero() {
        if (x == 0) {
            a = true;
            System.out.println("number is zero :" + a);
        } else {
            a = false;
            System.out.println("number is zero :" + a);

        }
    }
}
