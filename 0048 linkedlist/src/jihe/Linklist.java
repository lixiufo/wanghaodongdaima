package jihe;

import java.util.Iterator;
import java.util.LinkedList;

public interface Linklist {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
	
		list.add("����");
		list.add("���׽�");
		list.add("�����");
		list.add("������");
//		list.addFirst("���");
//		list.addLast("�Ҳ���");
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
