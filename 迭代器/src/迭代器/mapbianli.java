package ������;

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

		//ͨ���õ����е�Kֵ������ֵ
		//		 Set<Integer> seo = map.keySet(); //�õ�����key�ļ���
		//		           for (Integer i : seo) {
		//		        	   String str = map.get(i);
		//		           System.out.println(i + "     " + str);
		//		           }

		
		
		//�ڶ���
//		System.out.println("�ڶ��֣�ͨ��Map.entrySetʹ��iterator����key��value��");
//		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
//		while (it.hasNext()) {
//			Map.Entry<Integer, String> entry = it.next();
//			System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
//		}
		
		//������
		 for (String v : map.values()) {
			              System.out.println("value= " + v);
			          }
	}
}
