package Scanner;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int arm=0;
		int rem;
		int c;
		System.out.println("Enter the number");
		n=sc.nextInt();
		c=n;
		while(n>0) {
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if(c==arm) {
			System.out.println("Arm Strong Number");
		}
			else 
				System.out.println("Not a arm strong number");
		
		

	}

}
