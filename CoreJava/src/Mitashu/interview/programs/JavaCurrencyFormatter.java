package Mitashu.interview.programs;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
	        Locale.setDefault(new Locale("en","IN"));
	        String india = NumberFormat.getCurrencyInstance().format(payment);
	        Locale.setDefault(Locale.CHINA);
	        String china = NumberFormat.getCurrencyInstance().format(payment);
	        Locale.setDefault(Locale.US);
	        String us = NumberFormat.getCurrencyInstance().format(payment);
	        Locale.setDefault(Locale.FRANCE);
	        String france = NumberFormat.getCurrencyInstance().format(payment);
	        	        
	        System.out.println("US: " + us);
	        System.out.println("India: " + india);
	        System.out.println("China: " + china);
	        System.out.println("France: " + france);
	    }
}
