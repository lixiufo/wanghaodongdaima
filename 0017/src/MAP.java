import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MAP {
	public static void main(String[] args) {
				Map <String,Integer> a=new HashMap<String,Integer>();
				a.put("1", 1);
				a.put("2", 2);
				a.remove("1");
				System.out.println(	a.put("1", 1));
				System.out.println(	a.put("1", 2));
				System.out.println(a.remove("3", 2));
//		Map <String,Arraylist> a=new HashMap<String,Arraylist>();
//		Arraylist b= new Arraylist(23,"b",new Date());
//		Arraylist c= new Arraylist(1,"c",new Date());
//		Arraylist d= new Arraylist(2,"d",new Date());
//		Arraylist e= new Arraylist(3,"e",new Date());
//		a.put("1",b);
//		a.put("2",c);
//		a.put("3",d);
//		a.put("4",e);
//		System.out.println(a.get("1"));
//		System.out.println(a.get("2"));
//		System.out.println(a.get("3"));
//		System.out.println(a.get("4"));
		
//			System.out.println(a.size());	
		
//		for(Arraylist r:a.values()) {
//			System.out.println(r);
//		}
//		for(String key:a.keySet()) {
//			System.out.println(a.get(key));
//		}
//		for(Arraylist m :a.values()) {
//		System.out.println(m);
//	}
	}

}
