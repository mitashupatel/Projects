
public class Test2 {
	
	static int highestValue(int a[]) {
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
	/*static int secongHighestValue(int a[]) {
		int temp;
		for(int i=0;i<a.length;i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[j]=a[i];
					a[i]=temp;
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
			
		return a[a.length-2];
	}*/
	public static void main(String[] args) {
		/*int arr[]= {85,2,99,4,5};*/
		int arr[]= {1,545454,3,4,8,555545455,4,385,8,45858,5,5,4};
		System.out.println("Highest Value is"+highestValue(arr));
		System.out.println("Second Highest Value is: "+secondHighest(arr));
		/*System.out.println("Highest Value in Array is : "+highestValue(arr));
		System.out.println("Second Highest Value in Array is: "+secondHighest(arr));*/
	}

}
