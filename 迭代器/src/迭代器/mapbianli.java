package 迭代器;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapbianli {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "ab");
		map.put(4, "ab");
		map.put(5, "ab");
		map.put(6, "abddddd");
		System.out.println(map.size());

		//通过得到所有的K值，遍历值
		//		 Set<Integer> seo = map.keySet(); //得到所有key的集合
		//		           for (Integer i : seo) {
		//		        	   String str = map.get(i);
		//		           System.out.println(i + "     " + str);
		//		           }

		
		
		//第二种
//		System.out.println("第二种：通过Map.entrySet使用iterator遍历key和value：");
//		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
//		while (it.hasNext()) {
//			Map.Entry<Integer, String> entry = it.next();
//			System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
//		}
		
		//第三种
		 for (String v : map.values()) {
			              System.out.println("value= " + v);
			          }
	}
}
