package experiments;

public class DuplicateRemove {
	
	public static int removeDupli(int arr[],int n) {
		if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,1,1,1,2,11,1,22,2,11,22,1,3,33,3,33,13,1,1};
		int length=arr.length;
		length=removeDupli(arr, length);
		for (int i = 0; i<length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
