package lab_4;
import java.util.Scanner;
public class Q2 {
	static int sq_num(int a[],int size) {
		int sum=0;
		int sq=0;
		for(int i=0;i<size;i++)
		{
			sq=a[i]*a[i];
			sum=sum+sq;
		}
		return sum;
	}
	public static void main(String[]args) {
		int j=0;
		int[]arr=new int[15];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		System.out.println("Enter 10 array elements:");
		for (int i=1;i<=size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Sqaures of all numbers in array: "+ sq_num(arr,size));
		}
	}


