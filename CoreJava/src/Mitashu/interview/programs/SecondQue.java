package Mitashu.interview.programs;

public class SecondQue {

	static void printPairs(int arr[], 
						int n, int sum) 
	{ 

		for (int i = 0; i < n; i++) 
			for (int j = i + 1; j < n; j++) 
				if (arr[i] + arr[j] == sum) 
					System.out.println("(" + arr[i] + ", " + arr[j] + ")"); 
	} 

 
	public static void main(String[] arg) 
	{ 
		int arr[] = { 2, 4, 6, 10, 5 }; 
		int n = arr.length; 
		int sum = 16; 
		printPairs(arr, n, sum); 
	} 
} 

