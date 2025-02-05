package day6;
import java.util.Scanner;
public class SimpleCalc {
	   public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

		System.out.println("Enter a first number :");
		int num1 = scan.nextInt();
		System.out.println("Enter a second number :");
		int num2 = scan.nextInt();
		
		System.out.println("Enter a number for your choice:");
		System.out.println("add for 1");
		System.out.println("sub for 2");
		System.out.println("multiply for 3");
		System.out.println("division for 4");
		System.out.println("remainder for 5");
		
		int key = scan.nextInt();
		
		switch(key) {
		
		case 1:{
			System.out.println("addition of :"+ (num1+num2));
		}
		break;
		case 2:{
			System.out.println("subraction of :"+(num1-num2));
		}
		break;
		case 3:{
	        System.out.println("multiply of :"+(num1*num2));
		}
		break;
		case 4:{
	        System.out.println("division  of :"+(num1/num2));
		}
		break;
		case 5:{
	        System.out.println("remainder of :"+(num1%num2));
		}
		break;
		default:{
	        System.out.println("Enter a correct choice");
		}
		
		}
		}
	}

