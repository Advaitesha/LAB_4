package lab_4;
import java.util.Scanner;
public class Q1 {
// To print combinations of 3 numbers
public static void main(String[]args) {
	int num=0;
	 System.out.println("enter the number from range (0-9)");
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter first number: ");
	 int a=sc.nextInt();
	 System.out.println("enter second number: ");
	 int b=sc.nextInt();
	 System.out.println("enter third number: ");
	 int c=sc.nextInt();
	 for(int i=0;i<=a;i++) {
		 for (int j=0;j<=b;j++) {
			 for (int k=0;k<=c;k++) {
				 if(k!=i && k !=j && i!=j) {
					 num++;
					 System.out.println(i + " "+ j+" "+k);
				 }
			 }
		}
	}
	 System.out.println("Total no of three possible combinations are: "+num);	 
 }
}
