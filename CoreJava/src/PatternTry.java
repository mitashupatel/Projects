import java.util.Scanner;

public class PatternTry {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Size : ");
		int size=sc.nextInt();
		int []arr=new int[size];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter A Value "+(i+1)+" Value");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
			}
	
		}
		
	}

