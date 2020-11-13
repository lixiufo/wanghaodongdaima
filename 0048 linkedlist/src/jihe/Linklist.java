package jihe;

import java.util.Iterator;
import java.util.LinkedList;

public interface Linklist {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
	
		list.add("张三");
		list.add("李雷健");
		list.add("李秀佛");
		list.add("吴紫阳");
//		list.addFirst("你好");
//		list.addLast("我不好");
//		list.removeFirst();
//		list.removeLast();
//		list.getFirst();
//		list.getLast();
		list.set(1, "fdjfbdjj");
		
//		System.out.println(list.getFirst());
//		System.out.println(list.getLast());
		
//		for (int i = 0; i <list.size(); i++) {
//			System.out.println(list.get(i));
//		
//		}
//		for(String s:list) {
//			System.out.println(s);
//		
//		}
		Iterator<String> li=list.iterator();
		while(li.hasNext()) {
			System.err.println(li.next());
		}
	}

}
