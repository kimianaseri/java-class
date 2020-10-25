package stringproject;

import java.util.Scanner;

public class Main {

    public static Strng s1=new Strng();

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the string");
        s1.str=obj.nextLine();
        try {
            check();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }



    public static void check() throws Exception
    {
        String w[]=s1.str.split(" ");
        for(String s:w)
        {
            if (s.equals("0") || s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5") || s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9")) {
                throw new Exception("there is a number in your string");
            } else {
                System.out.println("the length of the string is:" + s1.str.length());
            }
        }

    }
}
