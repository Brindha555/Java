import java.util.Scanner;
public class Demo_three {
    public static void main(String[] args) {
        //for loop
        //Print numbers 1 to n
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a range to print:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
        sc.close();

        //Print even numbers
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter range:");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i%2==0){
               System.out.print(i +" ");
            }
            
        }
        sc.close();

        //Print odd numbers
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter range:");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i%2!=0){
               System.out.print(i +" ");
            }
            
        }
        sc.close();

        //Print sum of the numbers
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter range:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;    
        }
        System.out.print(sum);
        sc.close();

        //Factorial of a number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to find factorial:");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.print("The factorial of" + n + "is" + fact);
        sc.close();

        //While loop
        //print numbers 1 to 10
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter range:");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.print(i + " ");
            i--;
        }
        sc.close();

        //print even numbers
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter range:");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }


        //do-while
        //print numbers 1 to n
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter range:");
        int n=sc.nextInt();
        int i=1;
        do{
            System.out.print(i+" ");
            i++;
        }while(i<=n);

        //Even numbers
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter range:");
        int n=sc.nextInt();
        int i=1;
        do{
            if(i%2==0){
              System.out.print(i+" ");
            }
            i++;
        }while(i<=n);        
    }      
} 