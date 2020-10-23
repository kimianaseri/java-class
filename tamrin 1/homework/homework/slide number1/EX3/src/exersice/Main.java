package exersice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("a*x+b*y=e");
        System.out.println("c*x+d*y=f");
        int a,b,c,d,e,f;
        double x,y;
        System.out.println("a ra wared konid");
        a=new Scanner(System.in).nextInt();
        System.out.println("b ra wared konid");
        b=new Scanner(System.in).nextInt();
        System.out.println("c ra wared konid");
        c=new Scanner(System.in).nextInt();
        System.out.println("d ra wared konid");
        d=new Scanner(System.in).nextInt();
        System.out.println("e ra wared konid");
        e=new Scanner(System.in).nextInt();
        System.out.println("f ra wared konid");
        f=new Scanner(System.in).nextInt();
        if((a*d-b*c)==0){
            System.out.println("qeyre qabele hal");
        }
        else{
            x=(e*d-b*f)/(a*d-b*c);
            y=(a*f-e*c)/(a*d-b*c);
            System.out.println("x="+x);
            System.out.println("y="+y);
        }


    }
}
