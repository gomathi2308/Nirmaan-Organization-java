package day10;

import java.util.Scanner;

public class Calculator{
	
    void add(int num1,int num2) {
    System.out.println("Addiction :" + (num1+num2));
    }
    void sub(int num1,int num2) {
    System.out.println("Subraction :" + (num1-num2));
    }
    void multi(int num1,int num2) {
    System.out.println("Multiplication :" + (num1*num2));
    }
    void div(int num1,int num2) {
    System.out.println("Division :" + (num1/num2));
    }
    void modulos(int num1,int num2) {
        System.out.println("Modulos :" + (num1%num2));
    }
    
      public static void main(String[] args) {
    	  
    	  Calculator calc = new Calculator();
    	  
    	  Scanner u = new Scanner(System.in);
    	  
    	  System.out.println("Enter a num1 :");
    	  int num1 = u.nextInt();
    	  System.out.println("Enter a num2 :");
    	  int num2 = u.nextInt();
    	  
    	  calc.add(num1,num2);    	  // call method 
    	  calc.sub(num1,num2);
    	  calc.multi(num1,num2);
    	  calc.div(num1,num2);
    	  calc.modulos(num1,num2);

    	  
      }
}
