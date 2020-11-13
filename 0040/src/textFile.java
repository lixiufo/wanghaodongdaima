import java.io.File;
import java.io.IOException;

public class textFile {
public static void main(String[] args) {
	File file=new File("a.txt");
	File file6=new File("nm.txt");
	File file3=new File("C:\\Users\\Administrator\\Desktop\\mn.txt");
	File file1=new File("qwe");
	file1.mkdir();
	File file2=new File("n/b/c/d");
	file2.mkdirs();
	try {
		System.out.println("创建文件"+file6.createNewFile());
		System.out.println("创建文件"+file3.createNewFile());
		System.out.println("创建文件夹"+file1.createNewFile());
		System.out.println("创建文件"+file.createNewFile());
		System.err.println(file.exists());
		System.out.println("是不是文件"+file.isFile());
		System.out.println("相对路径"+file.getPath());
		System.out.println("绝对路径"+file.getAbsolutePath());
		System.out.println("文件名字"+file.getName());
		System.out.println("文件长度"+file.length());
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
