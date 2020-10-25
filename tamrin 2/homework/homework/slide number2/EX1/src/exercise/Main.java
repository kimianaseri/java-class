package exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("please enter first number:");
        Scanner input = new Scanner(System.in);
        Cslculator number = new Cslculator();
        int temp = input.nextInt();
        number.a = temp;
        System.out.println("please enter second number:");
        temp = input.nextInt();
        number.b = temp;
        System.out.println("please enter 1.+|2.-|3.*|4./ :");
        temp = input.nextInt();
        if (temp == 1 ){
            number.jam();
        }else if(temp == 2){
            number.tafrigh();
        }else if(temp == 3){
            number.zarb();
        }else if(temp == 4){
            number.taghsim();
        }
    }
}
