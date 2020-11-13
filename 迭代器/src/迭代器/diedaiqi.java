package µü´úÆ÷;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class diedaiqi {
	public static void main(String[] args) {
		List<Integer> coll = new ArrayList<>();
		coll.add(1);
		coll.add(2);
		coll.add(3);
		coll.add(4);
		coll.add(5);
		coll.add(6);
		coll.remove(0);
		 Iterator<Integer> it = coll.iterator();
		  while(it.hasNext()){
			              Integer s = it.next();
			            System.out.println(s);
			          }
			          System.out.println("-------------------");
	}
}
