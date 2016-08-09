import java.util.*;

public class SalesCommission {

public static void main(String []args)
{
	Scanner inputs=new Scanner(System.in);
	int []counter=new int[9];
	int n,i,k=0,c;
	int salary;
	System.out.println("Enter number of salesperson");
	n=inputs.nextInt();
	int []grosssale=new int[n];
	System.out.println("Enter their gross sales");
	for(i=0;i<n;i++)
	{
		grosssale[i]=inputs.nextInt();
		salary=200+(int)(.09*grosssale[i]);
		c=(salary/
				100)-2;
		if(c>8) c=8;
		if(c<0) c=0; 
		counter[c]++;
	}
	System.out.println("Tabulated format:");
	System.out.println("Salary range                 No.of.Salesperson");
	for(i=200;i<=1000;i=i+100)
	{	
		if(i!=1000)
			System.out.println("$"+i+"  to  "+"$"+(i+99)+"          -             "+counter[k++]);
		else
			System.out.println("$"+i+" and over "     + "         -             "+counter[k++]);
	}
	
}
}
