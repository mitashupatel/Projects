
public class ArrayCopy {

	public static void main(String[] args) {
		int c[]= {1,2,34,5,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		int b[]=c;
		
		
		
		System.out.println("Contents of a[] "); 
        for (int i=0; i<c.length; i++) {
            System.out.print(c[i] + " ");} 
  
        System.out.println("\n\nContents of b[] "); 
        for (int i=0; i<b.length; i++) {
            System.out.print(b[i] + " ");} 

	}

}
