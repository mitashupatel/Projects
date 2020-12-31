import java.util.Scanner;

public class TwoTry {

	public static void main(String[] args) {
		System.out.println("Enter A Number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Entered Number : "+n);
		int i,j;
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");		
		}
	}

}
