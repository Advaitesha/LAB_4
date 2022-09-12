package lab_4;
public class Q4 {
public static void main(String[]args) {
// file to add numbers divisble by 5 in given range...
	int i;
	int sum=0;
	for (i=41;i<250;i++) {
		if (i%5==0) {
			sum+=i;
		}
	}
	System.out.println("sum of all numbers divisible by 5 is: " +sum );	
	
	}
}

