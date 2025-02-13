package day13;

import java.util.Scanner;

public class Calac {
	 int add(int a,int b,int c) {
		return a+b+c;
	 }
	 int sub(int a,int b,int c) {
			return a-b-c;
		 }
	 int multi(int a,int b,int c) {
			return a*b*c;
		 }
	 int div(int a,int b,int c) {
			return a/b/c;
		 }
	 int mod(int a,int b,int c) {
			return a%b%c;
		 }

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a first number :");
      int num1 = sc.nextInt();
      System.out.println("enter a second number : ");
      int num2 = sc.nextInt();
      
      Calac c = new Calac();
      System.out.println("addition of : "+(c.add(num1,num2,30)));
      System.out.println("subraction of : "+(c.sub(num1,num2,10)));
      System.out.println("multiplication of : "+(c.multi(num1,num2,3)));
      System.out.println("division of : "+(c.div(num1,num2,38)));
      System.out.println("modulos of : "+(c.mod(num1,num2,3)));

	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
