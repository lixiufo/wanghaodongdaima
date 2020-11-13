import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

public class NIOTest4 {
public static void main(String[] args) {
	//我们回顾以前操作文件的过程  能停止吗？
	//操作这个文件 操作的过程中  
	//使用nio来上锁 是我们的操作停止  
	try {
		File file=new File("C:\\Users\\Administrator\\Desktop\\zx.txt");
		FileOutputStream fos=new FileOutputStream(file);
		//可以使用缓存 也可以使用通道 channel 使用通道必须使用缓存 
		FileChannel channel =fos.getChannel();
		//关于上锁的操作有两个 一个是lock()  一个是tryLock()  
		try {
			FileLock lock=channel.tryLock();
			if(lock!=null) {
				System.out.println("文件已经上锁");
				//在解锁之前我们可以让程序停止一段时间  
				Thread.sleep(10000);
//				TimeUnit.SECONDS.sleep(60);
				//解锁  
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
