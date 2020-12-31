
public class PatternNine {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=20;i++) {
			for(j=1;j<=50;j++) {
				if( j>= 20-i && j<=18+i) {
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
