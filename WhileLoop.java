package day8;

import java.util.Scanner;
public class WhileLoop {
   public static void main(String[] args) {
   boolean istrue=true;
   
   // while
   
	while(true) {
		Scanner sc = new Scanner(System.in);
		
		int choice,num1,num2;
		System.out.println("Enter your choice:");
		System.out.println("add for 1");
		System.out.println("sub for 2");
		System.out.println("multiply for 3");
		System.out.println("divide for 4");
		System.out.println("modulos for 5");
		System.out.println("stop for 6");

		choice = sc.nextInt();
		
		
		// block of if code 
		
		if(choice==1) {
			System.out.println("Enter a first number : ");
			num1 = sc.nextInt();
			System.out.println("Enter a second number : ");
			num2 = sc.nextInt();
			System.out.println("add is :"+(num1+num2));
		}
		else if(choice==2) {
			System.out.println("Enter a first number : ");
			num1 = sc.nextInt();
			System.out.println("Enter a second number : ");
			num2 = sc.nextInt();
			System.out.println("sub is :"+(num1-num2));
		}
		else if(choice==3) {
			System.out.println("Enter a first number : ");
			num1 = sc.nextInt();
			System.out.println("Enter a second number : ");
			num2 = sc.nextInt();
			System.out.println("sub is :"+(num1*num2));
		}
		else if(choice==4) {
			System.out.println("Enter a first number : ");
			num1 = sc.nextInt();
			System.out.println("Enter a second number : ");
			num2 = sc.nextInt();
			System.out.println("sub is :"+(num1/num2));
		}
	    else if(choice==5) {
	    	System.out.println("Enter a first number : ");
			num1 = sc.nextInt();
			System.out.println("Enter a second number : ");
			num2 = sc.nextInt();
			System.out.println("sub is :"+(num1%num2));
	    }			
		
	    else if(choice==6) {
			System.out.println("THANK YOU");
	    	break;	
        }
	    else {
			System.out.println("incorrect");
      }
	}
}
}
