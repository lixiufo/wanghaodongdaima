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
		System.out.println("�����ļ�"+file6.createNewFile());
		System.out.println("�����ļ�"+file3.createNewFile());
		System.out.println("�����ļ���"+file1.createNewFile());
		System.out.println("�����ļ�"+file.createNewFile());
		System.err.println(file.exists());
		System.out.println("�ǲ����ļ�"+file.isFile());
		System.out.println("���·��"+file.getPath());
		System.out.println("����·��"+file.getAbsolutePath());
		System.out.println("�ļ�����"+file.getName());
		System.out.println("�ļ�����"+file.length());
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
