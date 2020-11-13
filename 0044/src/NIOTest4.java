import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

public class NIOTest4 {
public static void main(String[] args) {
	//���ǻع���ǰ�����ļ��Ĺ���  ��ֹͣ��
	//��������ļ� �����Ĺ�����  
	//ʹ��nio������ �����ǵĲ���ֹͣ  
	try {
		File file=new File("C:\\Users\\Administrator\\Desktop\\zx.txt");
		FileOutputStream fos=new FileOutputStream(file);
		//����ʹ�û��� Ҳ����ʹ��ͨ�� channel ʹ��ͨ������ʹ�û��� 
		FileChannel channel =fos.getChannel();
		//���������Ĳ��������� һ����lock()  һ����tryLock()  
		try {
			FileLock lock=channel.tryLock();
			if(lock!=null) {
				System.out.println("�ļ��Ѿ�����");
				//�ڽ���֮ǰ���ǿ����ó���ֹͣһ��ʱ��  
				Thread.sleep(10000);
//				TimeUnit.SECONDS.sleep(60);
				//����  
				lock.release();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
}
}
