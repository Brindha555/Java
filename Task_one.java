import java.util.Scanner;
public class Task_one{
    public static void main(String[] args){
        // 1. Positive or negative number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        if(a>0){
            System.out.println("Positive number");
        }
        else if(a<0){
            System.out.println("Negative number");
        }
        else{
            System.out.println("Zero");
        }
        sc.close();

        //2.Odd or Even
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("It is even");
        }
        else{
            System.out.println("It is odd");
        }
        sc.close();

        //3.Sum of First N Natural Numbers
        int Count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of number:");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            Count+=i;
        }
        System.out.println("The sum of first n natural number is:"+Count);
        sc.close();

        //Formula method
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of number:");
        int n=sc.nextInt();
        int sum=n*(n+1)/2;
        System.out.println("The sum of first n natural number is:"+sum);
        sc.close();

        //Sum of numbers in a given range (start to end)
        //long sum = (long)m * (m + 1) / 2 - (long)(n - 1) * n / 2;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Start range:");
        int n=sc.nextInt();
        System.out out println("Enter the End range:");
        int m=sc.nextInt();
        for(int i=n;i<=m;i++){
            sum+=i;
        }
        System.out.println("Sum"+ sum);
        sc.close();

        //Greatest of Two Numbers
        //Build-in Math.max(a, b);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        if(a>b){
            System.out.println("a is greater");
        }
        else if{
            System.out.println("b is greater");
        }
        else{
            System.out.println("Both are equal");
        }
        sc.close();

    //     Greatest of Three Numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();

        System.out.println("Enter b:");
        int b = sc.nextInt();

        System.out.println("Enter c:");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
           System.out.println(a + " is greatest");
        } 
        else if (b >= a && b >= c) {
           System.out.println(b + " is greatest");
        } 
       else {
           System.out.println(c + " is greatest");
       }

       sc.close();

          //Leap Year or not
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter year:");
          int n=sc.nextInt();
          if(n%400==0 || (n%4==0 && n%100!=0)){
            System.out.println("Leap year");
          }
          else{
            System.out.println("Not a Leap year");
          }
          sc.close();

        //Prime Number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int Count=0;
        if(n<=1){
            System.out.println("Not a prime");
        }
        else{
            boolean isPrime = true;
            for(int i=2;i<=Math.sqrt(n);i++){ 
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
            System.out.println(n + "is Prime");
        }
        else
            System.out.print(n + "is not Prime");
        }
        
        sc.close();

        //Sum of the Digits
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int lastdigit=n%10;
            sum = sum + lastdigit;
            n = n/10;
        }
        System.out.println("Sum of digits" + sum);


        //Reverse a number
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();

        int rev=0;
        while(n>0){
            int lastdigit=n%10;
            rev=rev*10+lastdigit;
            n = n/10;
        }
        System.out.println("Reversed number =" + rev);
        sc.close();
        


        //Palindrome number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int original=n;
        int rev=0;
        while(n>0){
            int lastdigit=n%10;
            rev=rev*10+lastdigit;
            n=n/10;
        }
        if(original == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();



        

        



    }
}



