
public class linklist {
public static void main(String[] args) {
	LinkedList link=new LinkedList();
	link.addFirst("abc1");

	link.addFirst("abc2");

	link.addFirst("abc3");

	link.addFirst("abc4");

	While(!link.isEmpty()){//�˷������԰���˳��ȡ��Ԫ�أ����Ǳ�ɾ��������ȥģ��һЩ�򵥵����ݽṹ

	System.out.println(link.removeLast());//abc1��abc2��abc3��abc4

	}


}
}
