import java.util.Scanner;
import java.lang.System;
public class Demo_one{
    public static void main(String[]args){
        //Getting input for Name and Age
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name:");
        String a=sc.nextLine();
        System.out.print("Enter your Age:");
        int b=sc.nextInt();
        System.out.println(a);
        System.out.println(b);

        //Getting input for Name,Age,Address
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name:");
        String a=sc.nextLine();
        System.out.print("Enter your Age:");
        int b=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your Address:");
        String c=sc.nextLine();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //Add,Mul,Divide
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter c:");
        int c=sc.nextInt();
        int d=a*b*c;
        int e=a+b+c;
        int f=d/e;
        System.out.println(d);
        System.out.println(e);
        System.out.println(d/e);

        //Name,Score and dept
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Name:");
        String Name=sc.nextLine();
        System.out.print("Enter Score for 100:");
        double Score=sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Department:");
        String dept=sc.nextLine();
        System.out.println(Name);
        System.out.println(Score/10);
        System.out.println(dept);
    }
}