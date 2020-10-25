package risheyabi;

import java.util.Scanner;

public class Main {
   public static Coefficient a1=new Coefficient();
   public static Coefficient b1=new Coefficient();
   public static Coefficient c1=new Coefficient();
   public static double delta;
   public static double x1;
   public static double x2;


    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter coefficient of x^2:");
        a1.a=obj.nextInt();
        System.out.println("enter coefficient of x:");
        b1.b=obj.nextInt();
        System.out.println("enter the number:");
        c1.c=obj.nextInt();

        delta=(b1.b* b1.b)-(4*a1.a* c1.c);

        try{
            check();
        }catch(Exception e){
            System.out.println(e.getStackTrace());
        }

    }

    public static void check() throws Exception
    {
        if(delta<0)
        {
            throw new ArithmeticException("we are not able to find the roots");
        }
        else
        {
            x1=(b1.b+Math.sqrt(delta))/2*a1.a;
            System.out.println("x1:"+x1);
            x2=(b1.b-Math.sqrt(delta))/2*a1.a;
            System.out.println("x2:"+x2);
        }
    }

}
