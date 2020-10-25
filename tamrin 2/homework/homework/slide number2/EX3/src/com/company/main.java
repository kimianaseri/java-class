package com.company;

public class main {
    public static void main(String[] args) {
        NumberType number = new NumberType();
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int temp = input.nextInt();
        number.x = temp;
        number.isEven();
        number.isOdd();
        number.isPositive();
        number.isNegative();
        number.isZero();
    }
}
