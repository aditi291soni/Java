import java.util.Scanner;
public class Main{
     public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       System.out.println("Enter number");
       int n =in.nextInt(); //no of didgit
    // int n=321;
       int total=0;
     while(n>0){
        int rem=n%10;
        n=n/10;
        total=total*10+rem;
     }
     System.out.println("Reverse of no is "+total);
     
     }
}