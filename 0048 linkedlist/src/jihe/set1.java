package jihe;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set1 {
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("Œ“");
		set.add(" «");
		set.add("ªµ");
		set.add("µ∞");
		
		System.out.println(set.size());
		
		
//		set.clear();
//		System.out.println(set.isEmpty());
		
		//	for(String s:set) {
		//		System.out.println(s);
		//	}

		Iterator<String> li=set.iterator();
		while(li.hasNext()) {
			System.out.println(li.next());

		}
	}
}
