package day2;

import java.util.Scanner;

public class DataTypes {
 public static void main(String[] args) {
    System.out.println("ENTER A NAME");
    Scanner ss = new Scanner(System.in);
    String name = ss.next();
    ss.nextLine();
   System.out.println(name);
    System.out.println("department");
   String dep = ss.nextLine();
  System.out.println(dep);
	}
}