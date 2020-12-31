import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count<=2) {
			System.out.println("Number"+n+" is Prime");
		}
		else {
			System.out.println("Number"+n+" is Not Prime");

		}
	}

}
