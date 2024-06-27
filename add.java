import java.util.Scanner;

public class add {

	public static void main(String[] args) {
		int num1, num2, sum;
        	Scanner sc = new Scanner(System.in);
       		System.out.print("Enter First Number: ");
        	num1 = sc.nextInt();
        
        	System.out.print("Enter Second Number: ");
        	num2 = sc.nextInt();
        
        	sum = num1 + num2;
        	System.out.print("Sum of these numbers: "+sum);
    }
		
}
