
public class SecondHighest {
	static int highestValue(int a[]) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
			a[i]=a[i]+a[j];
			a[j]=a[i]-a[j];
			a[i]=a[i]-a[j];
			}
			}
		}
		return a[a.length-1]; 
	}
	static int secondHighest(int a[]) {
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[a.length-2];
	}
	static void swapValue(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Value of A is now: "+a);
		System.out.println("After Value of B is now: "+b);		
	}
	public static void main (String []args) {
		int arr[]= {1,545454,3,4,8,5,4,385,8,45858,5,5,4};
		int a=arr[1];
		int b=arr[8];
		System.out.println("Highest Value is"+highestValue(arr));
		System.out.println("Second Highest Value is: "+secondHighest(arr));
		System.out.println("Before Value of A is now: "+a);
		System.out.println("Before Value of B is now: "+b);
		swapValue(a, b);
		
	}
}