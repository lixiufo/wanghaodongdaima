import java.io.BufferedReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

public class NIOTest3 {
public static void main(String[] args) {
	//nio可以允许多个线程同时操作（异步 ）  也可以同步 
			//mina  apache    netty(jetty服务器 )  jboss公司生产的一个开源框架    rpc  
			//使用管道  pipe  来传递两个线程之间的数据  
			//管道分为两个端  发送端称之为  sink 
			//接收端 source  
			try {
				//打开一个管道 
				Pipe pipe=Pipe.open();
				//创建两个线程来进行通讯
				
				//这个线程用于接收第二个线程发送的数据
				//线程的创建可以使用这种构造方法的 有哪些？
				//lamda表达式的固定写法
				new Thread(()->{
					//这里写的内容相当于 实现runnable接口中 run方法内的内容 
					//通过管道对象获取一个sourcechannel对象
					Pipe.SourceChannel source=	pipe.source();
					//创建一个缓存对象
					ByteBuffer buffer=ByteBuffer.allocate(20);
					//创建接收读取数据的变量
					int count=0;
					try {
						//每次读取的内容放入count中
						count=source.read(buffer);
						//重置索引  position limit capacity
						buffer.flip();
						System.out.println("接收到另外一个线程写的数据是"+new String(buffer.array(),0,count));
					} catch (IOException e) {
						e.printStackTrace();
					}
				},"接收端") .start();
				
				//这个线程用于向第一个线程发送数据
				new Thread(()->{
					//这里写需要传递的数据 
					String str="hello 世界";
					Pipe.SinkChannel sink=pipe.sink();
					ByteBuffer buffer=ByteBuffer.allocate(20);
					buffer.put(str.getBytes());
					buffer.flip();
					try {
						sink.write(buffer);
					} catch (IOException e) {
						e.printStackTrace();
					}
				},"发送端").start();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

}


