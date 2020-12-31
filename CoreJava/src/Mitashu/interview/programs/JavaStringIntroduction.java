package Mitashu.interview.programs;

import java.util.Scanner;

public class JavaStringIntroduction {
	
	public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int c= A.length()+B.length();
        A=A.substring(0, 1).toUpperCase() + A.substring(1);
        B=B.substring(0, 1).toUpperCase() + B.substring(1);
        
        System.out.println(c);
        if(A.compareTo(B)<= 0) {
        	System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
        System.out.println(A+" "+B);
        sc.close();
    }
}
