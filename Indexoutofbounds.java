package arrayindex;
import java.util.Scanner;;
public class Indexoutofbounds {
	public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of elements in the array");
int n=s.nextInt();

try{
System.out.println("Enter the elements in the array");
int a[]=new int[n];

for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
	
}

System.out.println("Enter the index of the array element you want to access");
int n2=s.nextInt();
System.out.println(a[n2]);
System.out.println("The array element successfully accessed");
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println(e);	
}
	}
	
}