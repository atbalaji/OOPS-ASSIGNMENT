import java.util.*; 
 
public class Duplicate {
	public static boolean contain (int b[],int a){
		int i=0;
		while(i<b.length){
			if(b[i]==a){
				return true;
			}
			else{
				i++;
			}
		}
		return false;
	}	
	public static void main(String []args){
		Scanner inputs=new Scanner(System.in);
		int []a=new int[5];
		int i,b,j,c=0;
		System.out.println("Enter the five values from 10 to 100");
		int k=0;
		for(i=0;i<5;i++){
			b=inputs.nextInt();
			if(!contain(a,b) && ((b>=10)&&(b<=100))){
				a[k++]=b;
				c++;
			}
			System.out.println("The complete set of unique values");
			for(j=0;j<c;j++){
				System.out.print(a[j]+" ");				
			}	
		}
	}
}
