import java.util.SortedMap;
import java.nio.charset.Charset;
import java.util.Map.Entry;
import java.util.SortedMap;

public class NIOTest5 {
public static void main(String[] args) {
	//��ȡ��ǰϵͳ֧�ֵı����ʽ  
	//charset   utf-8   
	//sort  ����  hashmap�����   SortedMap�����
	SortedMap<String, Charset> map=Charset.availableCharsets();
	for(Entry<String,Charset> entry:map.entrySet()) {
		System.out.println(entry.getKey()+"----"+entry.getValue());
	}
	
	
	
}
}
