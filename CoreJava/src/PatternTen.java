
public class PatternTen {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=4;i++) {
			for(j=1;j<=7;j++) {
				if(j>=i && j<= 8-i) {
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
