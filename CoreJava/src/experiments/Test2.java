package experiments;

import java.util.ArrayList;
import java.util.HashSet;

public class Test2 {

	public static void main(String[] args) {
		int a[]= {10,12,11,13};
		int b[]= {22,23};
		HashSet<Integer> h=new HashSet<Integer>();
		ArrayList<Integer> c=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				h.add(a[i]+a[j]);
				
			}
			}
	
		c.addAll(h);
		
		for(int i=0;i<c.size();i++) {
			System.out.println(c.get(i));
		}
		System.out.println("Checking");
		
		/*for(int i=0;i<c.size();i++) {
			for(int j=0;j<c.size();j++) {
				if(c.get(i)==c.get(j)) {
					c.remove(j);
				}
			}
		}*/
		for(int i=0;i<c.size();i++) {
			for(int j=0;j<b.length;j++) 
				
			{
				if(c.get(i)==b[j]) {
					System.out.println(c.get(i));
					
				}
				
			}
			}
		}
	}



