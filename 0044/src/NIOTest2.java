import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOTest2 {
	public static void main(String[] args) {
		//��ȡ�����ļ�������̨  ʹ��  ͨ��channel    �ܵ�  
		//ͨ������һ����· ����Ҫ��  Ҳ���� ����  buffer 
		//���������� ���ǵ����  ��ͨ����˫��� ���ܶ�Ҳ��д  
		try {
			//���ر���ȡ���ļ�
			FileInputStream fis=new FileInputStream("a.txt");
			//���һ��ͨ������ ���ڲ������� ��·
			FileChannel channel=fis.getChannel();
			//������� �൱�ڻ�
			ByteBuffer buffer=ByteBuffer.allocate(20);
			//��������һ��д����� ���ڴ�����Ƕ�ȡ������ 
			ByteArrayOutputStream bos=new ByteArrayOutputStream();
			//����������Ҫ������������ ��һ�� ������ȡ ��ȡ���Ժ� ��д�뵽
			//bos������
			int count=0;//��¼��ȡ������  
			while((count=channel.read(buffer))!=-1) {
				//��Ϊ��ȡ�Ĳ���ͬ����ı�ָ�� ����������Ҫ����ָ��
				buffer.flip();
				//��Ȼʹ��whileѭ������ȡbuffer
				while(buffer.hasRemaining()) {
					//ÿ�ζ�ȡ����һ���ֽ� ���뵽bos������
					//��������ǻ����ڴ�� 
					bos.write(buffer.get());	
				}
				//�������ݲ������ ��ջ���  
				buffer.clear();
			}
			//��ȡ�ļ��е�����
//			String a=new String(bos.toByteArray());
//			System.out.println(a);
			System.out.println(new String(bos.toByteArray()));
			//�ر�ͨ��
			channel.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}