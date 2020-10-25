package com;

import java.util.Scanner;

public class Main {
    public static User user1=new User();
    public static User user2=new User();
    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);
        System.out.println("please enter first users name:");
        user1.name=obj.nextLine();
        System.out.println("enter first persons family name:");
        user1.family=obj.nextLine();
        System.out.println("enter first users age:");
        user1.age=obj.nextInt();
        System.out.println("please enter second users name:");
        user2.name=obj.nextLine();
        System.out.println("please enter second users family:");
        user2.family=obj.nextLine();
        System.out.println("please enter second users age:");
        user2.age=obj.nextInt();
        System.out.println(user1.str = user1.name + user1.family + user1.age);
        System.out.println(user2.str = user2.name + user2.family + user2.age);

       try{
           Condition();
       }catch (Exception e){
          e.getMessage();
       }

    }

    public static void Condition() throws Exception{
        if(user1.str.equals(user2.str))
            throw new Exception("input information is the same!");
        else
            System.out.println("information was saved ");
    }
}
