package experiments;

import java.util.Scanner;

public class Test {
	public static void main (String args[]) {
	Scanner sc=new Scanner(System.in);
	int l=sc.nextInt();
	int a[]= new int [l];
	for(int i=0;i<l;i++) {
		a[i]=sc.nextInt();
	}
	
	int find=sc.nextInt();
	
	for(int i=0;i<a.length;i++) {
		if(a[i]==find) {
			System.out.println("Your Number is here"+a[i]);
			System.out.println("it is on this index"+i);
		}
		
	}
	sc.close();
}
}