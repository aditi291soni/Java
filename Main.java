import java.util.Scanner;
public class Main{
     public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       System.out.println("Enter number");
       int num1 =in.nextInt(); //no of didgit
            System.out.println("Enter  Second number");
       int num2 =in.nextInt(); //no of didgit
     swap(num1,num2);
   

    // System.out.println(swap);
}
static void swap(int num1,int num2){
    int temp=num2;
   num2=num1;
   num1=temp;
System.out.println(num1 + " " + num2);
}
}