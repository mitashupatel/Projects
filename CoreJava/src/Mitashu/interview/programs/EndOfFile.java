package Mitashu.interview.programs;

import java.util.Scanner;

public class EndOfFile {
	
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   for(int i = 1; sc.hasNext()== true; i++){
		       System.out.println(i + " " + sc.nextLine());
		   }
		}
}
