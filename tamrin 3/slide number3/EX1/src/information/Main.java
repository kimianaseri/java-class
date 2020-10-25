package information;

import java.util.Scanner;

public class Main {
    public static Student student=new Student();
    public static String studentname="kimia naseri";
    public static String studentusername="981113061";
    public static String studentpass="3140172257";


    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter your name:");
        student.name=obj.nextLine();
        System.out.println("enter your username:");
        student.username=obj.nextLine();
        System.out.println("enter your password:");
        student.password=obj.nextLine();

        try {
            check();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void check()throws Exception
    {
        if(!student.name.equals(studentname) || !student.username.equals(studentusername) || !student.password.equals(studentpass))
        {
            throw new Exception("the information does not match!");
        }
        else
        {
            System.out.println(student.name);
            System.out.println(student.username);
            System.out.println(student.password);
        }
    }

}
