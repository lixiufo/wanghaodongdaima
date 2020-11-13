import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOTest2 {
	public static void main(String[] args) {
		//读取本地文件到控制台  使用  通道channel    管道  
		//通道类似一条铁路 还需要火车  也就是 缓存  buffer 
		//跟流的区别 流是单向的  而通道是双向的 既能读也能写  
		try {
			//加载被读取的文件
			FileInputStream fis=new FileInputStream("a.txt");
			//获得一个通道对象 用于操作数据 铁路
			FileChannel channel=fis.getChannel();
			//缓存对象 相当于火车
			ByteBuffer buffer=ByteBuffer.allocate(20);
			//再来创建一个写入对象 用于存放我们读取的内容 
			ByteArrayOutputStream bos=new ByteArrayOutputStream();
			//现在我们需要进行两步操作 第一步 先来读取 读取完以后 在写入到
			//bos对象中
			int count=0;//记录读取的数据  
			while((count=channel.read(buffer))!=-1) {
				//因为读取的操作同样会改变指针 所以我们需要重置指针
				buffer.flip();
				//仍然使用while循环来读取buffer
				while(buffer.hasRemaining()) {
					//每次读取的是一个字节 放入到bos对象中
					//这个对象是基于内存的 
					bos.write(buffer.get());	
				}
				//所有数据操作完毕 清空缓存  
				buffer.clear();
			}
			//读取文件中的内容
//			String a=new String(bos.toByteArray());
//			System.out.println(a);
			System.out.println(new String(bos.toByteArray()));
			//关闭通道
			channel.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}