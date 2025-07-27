import java.util.Scanner;
public class Main{
     public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       System.out.println("Enter number");
       int num1 =in.nextInt(); //no of didgit
            System.out.println("Enter  Second number");
       int num2 =in.nextInt(); //no of didgit
        System.out.println("Enter Operator");
       char op =in.next().trim().charAt(0);
    // int n=321;
       float total=0;
    switch(op){
        case '+':
            total=num1+num2;
            break;
        case '-':
            total=num1-num2;
            break;
        case '*':
            total=num1*num2;
            break;
        case '/':
            total=num1/num2;
            break;
        default:
        System.out.println("Please enter valid operator");
    }
    System.out.println(total);
}}