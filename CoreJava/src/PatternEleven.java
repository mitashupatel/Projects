
public class PatternEleven {

	public static void main(String[] args) {
		int i,j,k=0;
		for(i=1;i<=7;i++) {
				if(i<=4) {
					k++;}
				else {
					k--;
				}
			for(j=1;j<=4;j++) {
				if(j<=k) {
					 System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}
