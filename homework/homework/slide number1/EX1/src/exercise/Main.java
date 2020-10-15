package exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mostatil mostatil=new Mostatil();
        System.out.println("please enter tool:");
        mostatil.tool=new Scanner(System.in).nextInt();
        System.out.println("enter arz:");
        mostatil.arz=new Scanner(System.in).nextInt();
        mostatil.a();
        mostatil.b();


        Moraba moraba=new Moraba();
        System.out.println("tule morabaa ra vared konid:");
        moraba.tul=new Scanner(System.in).nextInt();
        moraba.c();
        moraba.d();

    }
}
