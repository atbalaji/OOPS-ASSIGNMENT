
public class Employee {
	String firstname,lastname;
	double salary;
	public Employee(){
		firstname=null;
		lastname=null;
		salary=0;
	}
	public Employee(String first,String last,double a){
		firstname=first;
		lastname=last;
		if(a>=0)
		salary =a;
	}
	public void setFirst(String a){
		firstname =a; 
	}
	public void setLast(String b){
		lastname =b;
	}
	public void setSal(double a){
		if(a>=0)
		 salary=a;
	}
	public String getFirst() {
		return firstname;
	}
	public String getLast() {
		return lastname;
	}
	public double getSal() {
		return salary;
	}
	public void raise(){
		salary+=(0.1*salary);
	}
	
	public void display(){
		System.out.println("Yearly Salary of Employee "+firstname+" "+lastname+" is"+getSal());
	}	
}

