import java.util.SortedMap;
import java.nio.charset.Charset;
import java.util.Map.Entry;
import java.util.SortedMap;

public class NIOTest5 {
public static void main(String[] args) {
	//获取当前系统支持的编码格式  
	//charset   utf-8   
	//sort  排序  hashmap无序的   SortedMap有序的
	SortedMap<String, Charset> map=Charset.availableCharsets();
	for(Entry<String,Charset> entry:map.entrySet()) {
		System.out.println(entry.getKey()+"----"+entry.getValue());
	}
	
	
	
}
}
