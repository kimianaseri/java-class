package com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Person p1=new Person();
        System.out.println("enter persons name:");
        p1.name=obj.nextLine();
        System.out.println("enter persons average:");
        p1.avg=obj.nextFloat();
        Map map=new HashMap();
        map.put("name",p1.name);
        map.put("average",p1.avg);
        Collection vset=map.values();
        for(Object i : vset)
            System.out.println(i);
    }
}
