
public class PatternTwelve {

	public static void main(String[] args) {
		int i,j,k=0;
		for(i=1;i<=7;i++) {
			if(i<=4) {
				k++;
			}
			else {
				k--;
			}
			for(j=1;j<=7;j++) {
				
				if(j>= 5-k && j<= 3+k) {
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
