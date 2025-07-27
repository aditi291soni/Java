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
    if(op=='+'){
total=num1 +num2;
    }
    else if(op=='-'){
     total=num1 -num2;   
    }
    else if(op=='*'){
      total=num1 *num2;  
    }
    else if(op=='/'){
       total=num1 /num2; 
    }else{
       System.out.println("Operator not found"); 
    }
     System.out.println(total);
     
     }
}