package dars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lesson lesson = new Lesson();
        lesson.name[0] = "math2";
        lesson.pishniyaz[0]="math1";
        lesson.hamniyaz[0]="moadelat";
        lesson.unit[0] = 3;
        lesson.name[1] = "phisic2";
        lesson.pishniyaz[1] = "phisic1";
        lesson.hamniyaz[1] = "az phizic1";
        lesson.unit[1] = 3 ;
        Scanner input = new Scanner(System.in);

        for (int i = 0 ; i<2 ; i++){
            System.out.println("Enter the name of your lesson:");
            String temp = input.nextLine();
            if (temp.equals(lesson.name[i]))
            {
                System.out.println("pishniyaz:" + lesson.pishniyaz[i]);
                System.out.println("hamniyaz:" + lesson.hamniyaz[i]);
                System.out.println("unit=" + lesson.unit[i]);
            }

        }
    }
}
