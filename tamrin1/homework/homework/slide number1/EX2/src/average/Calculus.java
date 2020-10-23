package average;

import java.util.Scanner;

public class Calculus {
    float grade;
    int zarib;
    int n;
    float average;
    int i;
    float sum;
    int s;

    public void averagee()
    {
        for(i=0;i<n;i++)
        {
            System.out.print("enter your grade");
            grade=new Scanner(System.in).nextFloat();
            System.out.print("enter zarib");
            zarib=new Scanner(System.in).nextInt();
            sum+=grade;
            s+=zarib;
        }
        average=sum/s;
        System.out.print("average :"+average);
    }
}
