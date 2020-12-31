package experiments;

import java.util.ArrayList;
import java.util.Iterator;

public class ThreadEx  {

	public static void main(String[] args) {
		int count=0;
		int a[]= {1,2,3,5,6,8,9,11};
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<a.length;i++) {
			for (int j = 2; j < i-1; j++) {
				if(a[i]%j==0) {
					count++;
				}	
			}
			if(count==0) {
				list.add(a[i]);
			}
			else {
				count=0;
			}
		}
		
		for (Object object : list) {
			System.out.println(object);
		}
		for(int i = 0; i < list.size(); i++) {   
		    System.out.print(list.get(i)+" ");
		}
		System.out.println();
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
