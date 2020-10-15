package average;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculus student=new Calculus();
        System.out.println("enter the number of your lessons:");
        student.n=new Scanner(System.in).nextInt();

        student.averagee();
    }
}
