
public class linklist {
public static void main(String[] args) {
	LinkedList link=new LinkedList();
	link.addFirst("abc1");

	link.addFirst("abc2");

	link.addFirst("abc3");

	link.addFirst("abc4");

	While(!link.isEmpty()){//此方法可以按照顺序取出元素，但是被删除，可以去模拟一些简单的数据结构

	System.out.println(link.removeLast());//abc1、abc2、abc3、abc4

	}


}
}
