import java.awt.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
public class Arraylist1 {
	public static void main(String[] args) {

		ArrayList<Arraylist> a=new ArrayList<Arraylist>();
		
		
		
//		Arraylist b= new Arraylist(27,"b",new Date());
		Arraylist c= new Arraylist(1,"c",new Date());
		Arraylist d= new Arraylist(1333,"d",new Date());
		Arraylist e= new Arraylist(3,"e",new Date());
		a.add(new Arraylist(23,"b",new Date()));
		a.add(c);
		a.add(d);
		a.add(e);
	

//		System.out.println(b);
		System.out.println(a.get(3));
//			System.out.println(a.remove(c));
//			System.out.println(a.size());	
//	System.out.println("�޸ĵĶ�����"+	a.set(2, new Arraylist(0, "hhj", new Date())));
//			System.out.println(a.get(2));
		//	System.out.println(a.remove(2));
		
		//����ArrayList�������ַ�ʽ 
	//	forѭ��
//		for(int i=0;i<a.size();i++) {
//			System.out.println(a.get(i));
	//	��ǿforѭ��
		for(Arraylist n: a) {
			System.out.println(n);
		}
		//������  
//		Iterator<Arraylist> lk=a.iterator();
//		while(lk.hasNext()) {
//			//��Ҫ�ڵ��������������޸ļ��ϵ����� ���� ��ɾ�� 
//			System.out.println(lk.next());
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

	}