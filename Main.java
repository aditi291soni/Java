import java.util.Scanner;
public class Main{
     public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       System.out.println("Enter number");
       int n =in.nextInt(); //no of didgit
        System.out.println("Enter number whose no of occurance want to find");
        int b =in.nextInt();
    // int n=53567;
    // int b=5;
       int count=0;
       
       while(n>0){
        int p=n%10;
        if(p==b){
            count++;
   
        }
        n=n/10;
       }
       System.out.println("No of occurance is"+count);
     }
}