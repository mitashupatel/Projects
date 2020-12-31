package experiments;

import java.util.HashSet;

public class Test3 {

	public static void main(String[] args) {
		int a[]= {10,12,11,13};
		int b[]= {22,23};
		HashSet c=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				c.add(a[i]+a[j]);
				
			}
			}
		for(int i=0;i<c.size();i++) {
			System.out.println(c);
		}
	}

}
