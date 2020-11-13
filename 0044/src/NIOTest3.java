import java.io.BufferedReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

public class NIOTest3 {
public static void main(String[] args) {
	//nio�����������߳�ͬʱ�������첽 ��  Ҳ����ͬ�� 
			//mina  apache    netty(jetty������ )  jboss��˾������һ����Դ���    rpc  
			//ʹ�ùܵ�  pipe  �����������߳�֮�������  
			//�ܵ���Ϊ������  ���Ͷ˳�֮Ϊ  sink 
			//���ն� source  
			try {
				//��һ���ܵ� 
				Pipe pipe=Pipe.open();
				//���������߳�������ͨѶ
				
				//����߳����ڽ��յڶ����̷߳��͵�����
				//�̵߳Ĵ�������ʹ�����ֹ��췽���� ����Щ��
				//lamda���ʽ�Ĺ̶�д��
				new Thread(()->{
					//����д�������൱�� ʵ��runnable�ӿ��� run�����ڵ����� 
					//ͨ���ܵ������ȡһ��sourcechannel����
					Pipe.SourceChannel source=	pipe.source();
					//����һ���������
					ByteBuffer buffer=ByteBuffer.allocate(20);
					//�������ն�ȡ���ݵı���
					int count=0;
					try {
						//ÿ�ζ�ȡ�����ݷ���count��
						count=source.read(buffer);
						//��������  position limit capacity
						buffer.flip();
						System.out.println("���յ�����һ���߳�д��������"+new String(buffer.array(),0,count));
					} catch (IOException e) {
						e.printStackTrace();
					}
				},"���ն�") .start();
				
				//����߳��������һ���̷߳�������
				new Thread(()->{
					//����д��Ҫ���ݵ����� 
					String str="hello ����";
					Pipe.SinkChannel sink=pipe.sink();
					ByteBuffer buffer=ByteBuffer.allocate(20);
					buffer.put(str.getBytes());
					buffer.flip();
					try {
						sink.write(buffer);
					} catch (IOException e) {
						e.printStackTrace();
					}
				},"���Ͷ�").start();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

}


