import java.util.*;
public class EmployeeTest {

	public static void main(String []args)
	{
		Scanner inputs =new Scanner(System.in);
		Employee e1,e2;
		String first,last;
		double sal;
		
		System.out.println("Enter the details of first employee");
		first=inputs.next();
		last=inputs.next();
		sal=inputs.nextDouble();
		e1=new Employee(first,last,sal);

		System.out.println("Enter the details of second employee");
		first=inputs.next();
		last=inputs.next();
		sal=inputs.nextDouble();
		e2=new Employee();
		e2.setFirst(first);
		e2.setLast(last);
		e2.setSal(sal);
		
		System.out.println("Before  the salary hike of two employees");
		e1.display();
		e2.display();
		e1.raise();
		e2.raise();
		
		System.out.println("After the salary hike of two employees");
		e1.display();
		e2.display();
		
	}
}
