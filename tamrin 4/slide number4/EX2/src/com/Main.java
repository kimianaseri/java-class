package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person p1=new Person();
        Scanner obj=new Scanner(System.in);
        System.out.println("enter your name:");
        p1.name=obj.nextLine();
        p1.password=obj.nextLine();
        System.out.println("name: " + p1.name + " password:" + p1.password);
        Person p2=null;
        try {
            p2=(Person)p1.clone();
        }catch(CloneNotSupportedException e)
        {
            System.out.println("exception not supported");
        }


        Person p3=null;
        try{
            p3=(Person) p1.clone();
        }catch(CloneNotSupportedException e){
            System.out.println("clone not supported");
        }


        Person p4=null;
        try{
            p4=(Person) p1.clone();
        }catch(CloneNotSupportedException e){
            System.out.println("clone not supported");
        }
    }
}
