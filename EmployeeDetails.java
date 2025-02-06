package day10;

public class EmployeeDetails {
    String name;
    int id;
    long phoneNo;
    double salary;
   
	public static void main(String[] args) {
		
       EmployeeDetails emp1 = new EmployeeDetails();
      
       emp1.name = "vidhya";
       emp1.id = 121;
       emp1.phoneNo = 958746126;
       emp1.salary = 34000.35;
       System.out.println("Employee1 Details");
       System.out.println();
       System.out.println(emp1.name);
       System.out.println(emp1.id);
       System.out.println(emp1.phoneNo);
       System.out.println(emp1.salary);
       System.out.println();
      
       EmployeeDetails emp2 = new EmployeeDetails();
       
       emp2.name = "Anitha";
       emp2.id = 122;
       emp2.phoneNo = 968746126;
       emp2.salary = 35000.90 ;
       System.out.println("Employee2 Details");
       System.out.println();
       System.out.println(emp2.name);
       System.out.println(emp2.id);
       System.out.println(emp2.phoneNo);
       System.out.println(emp2.salary);
       System.out.println();
       
       EmployeeDetails emp3 = new EmployeeDetails();
       
       emp3.name = "Harini";
       emp3.id = 123;
       emp3.phoneNo = 968756126;
       emp3.salary = 36000.90 ;
       System.out.println("Employee3 Details");
       System.out.println();
       System.out.println(emp3.name);
       System.out.println(emp3.id);
       System.out.println(emp3.phoneNo);
       System.out.println(emp3.salary);
       System.out.println();

       EmployeeDetails emp4 = new EmployeeDetails();
       emp4.name = "Yamuna";
       emp4.id = 124;
       emp4.phoneNo = 968747126;
       emp4.salary = 36000.90 ;
       System.out.println("Employee4 Details");
       System.out.println();
       System.out.println(emp4.name);
       System.out.println(emp4.id);
       System.out.println(emp4.phoneNo);
       System.out.println(emp4.salary);
       System.out.println();
       
       EmployeeDetails emp5 = new EmployeeDetails();
       emp5.name = "Kavya";
       emp5.id = 125;
       emp5.phoneNo = 968747326;
       emp5.salary = 37000.90 ;
       System.out.println("Employee5 Details");
       System.out.println();
       System.out.println(emp5.name);
       System.out.println(emp5.id);
       System.out.println(emp5.phoneNo);
       System.out.println(emp5.salary);
       System.out.println();

	}

}
