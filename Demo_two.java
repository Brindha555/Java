import java.util.Scanner;
public class Demo_two{
    public static void main(String[]args){
        //IF-ELSE DEMO
        Get input for var mark.If mark>35 print pass,else print fail.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mark:");
        int Mark=sc.nextInt();
        if(Mark>35){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }

        //Positive Number Check
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0){
            System.out.println("It is a positive number");
        }
        else if{
            System.out.println("It is a negative number");
        }
        else{
            System.out.println("It is Zero");
        }

        //Eligible to vote
        System.out.println("Enter your age:");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not Eligible to vote");
        }
        sc.close();
        

        // Odd or Even
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
        sc.close();


        // Pass or Fail
        System.out.println("Enter the mark:");
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        if(mark>=40){
            System.out.println("You are pass");
        }
        else{
            System.out.println("You failed");
        }
        sc.close();

        //Greater of two numbers
        System.out.println("Enter a:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter a number:");
        int b=sc.nextInt();
        if(a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
        sc.close();

        //Else-if
        // Grade Calculator
        System.out.println("Enter your mark:");
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        if(mark>=90 && mark<=100){
            System.out.println("Grade A");
        }
        else if(mark>=75 && mark<90){
            System.out.println("Grade B");
        }
        else if(mark>=60 && mark<75){
            System.out.println("Grade C");
        }
        else if(mark>=40 && mark<60){
            System.out.println("Grade D");
        }
        else if(mark<40){
            System.out.println("Fail");
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();

        //Electricity Bill
        System.out.println("Enter the units consumed:");
        Scanner sc=new Scanner(System.in);
        int units=sc.nextInt();
        int amt=0;
        if(units>0 && units<=100){
            amt+=1*units;
            System.out.println("Total bill:"+amt);
        }
        else if(units>100 && units<=200){
            amt+=100+2*(units-100);
            System.out.println("Total bill:"+amt);
        }
        else if(units>200 && units<=300){
            amt+=100+2*100+3*(units-200);
            System.out.println("Total bill:"+amt);
        }
        else if(units>300){
            amt+=100+2*100+3*100+5*(units-300);
            System.out.println("Total bill:"+amt);
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();

        // Age category
        System.out.println("Enter age:");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>0 && age<13){
            System.out.println("Child");
        }
        else if(age>=13 && age<=19){
            System.out.println("Teen");
        }
        else if(age>=20 && age<=59){
            System.out.println("Adult");
        }
        else if(age>=60){
            System.out.println("Senior Citizen");
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();


        //Nested-if
        //Largest of three numbers
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        System.out.println("Enter c:");
        int c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("a is largest");
            }
            else{
                System.out.println("c is largest");
            }
        }
        else{
            if(b>c){
                System.out.println("b is largest");
            }
            else{
                System.out.println("c is largest");
            }
        }
        
        //Exam eligibility
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your attendance %");
        int attd=sc.nextInt();
        if(attd>=75){
            System.out.println("Enter your internal marks");
            int i_mark=sc.nextInt();
            if(i_mark>=40){
                System.out.println("you are eligible");
            }
            else{
                System.out.println("You are not eligible");
            }
        }
        else{
            System.out.println("You are not eligible");
        }

         
        //Loan Approval
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your salary:");
        int salary=sc.nextInt();
        if (salary>=30000){
            System.out.println("Enter cibil score:");
            int c_score=sc.nextInt();
            if(c_score>=700){
                System.out.println("Loan Approved");
            }
            else{
                System.out.println("Rejected");
            }
        }
        else{
            System.out.println("Not eligible");
        }

         
        //Switch Statement
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        switch(choice){
            case 1: System.out.println("Monday");
                    break;
            case 2: System.out.println("Tuesday");
                    break;
            case 3: System.out.println("Wednesday");
                    break;
            case 4: System.out.println("Thursday");
                    break;
            case 5: System.out.println("Friday");
                    break;
            case 6: System.out.println("Saturday");
                    break;
            case 7: System.out.println("Sunday");
                    break;
            default:System.out.println("Invalid choice");
        }

        //Simple calculator
        Scanner sc=new  Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b");
        int b=sc.nextInt();
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int choice=sc.nextInt();
        switch (choice){
            case 1: System.out.println("sum ="+(a+b));break;
            case 2: System.out.println("Difference ="+(a-b));break;
            case 3: System.out.println("Product ="+(a*b));break;
            case 4: System.out.println("Quotient ="(a/b));break;
            default: System.out.println("Invalid operation");
        }


        //Vowel or Consonant
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        int ch=sc.next().charAt(0);
        switch(ch){
            case:'a':
            case:'e':
            case:'i':
            case:'o':
            case:'u':
            case:'A':
            case:'E':
            case:'I':
            case:'O':
            case:'U':
                     System.out.println("Vowel");break;
            default: System.out.println("Consonant");
        }
        sc.close();
    }
}