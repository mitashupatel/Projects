package com.mylearrning.basic;

public class AbstDemo {


		public static void main(String[] args) {
			
			int a = 1;
			int b = 0;
			try {
			System.out.println(a/b);
			
			}catch (ArithmeticException e) {
				e.printStackTrace();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Hello");
			
			
			
		}

}
