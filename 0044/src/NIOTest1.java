import java.nio.ByteBuffer;

public class NIOTest1 {
	public static void main(String[] args) {
		String str="Abcdefg";
		ByteBuffer buffer=ByteBuffer.allocate(20);
		buffer.put(str.getBytes());

		//System.out.println("写入数据-----位置指针"+buffer.position()+"容量大小指针"+buffer.capacity()+"分割指针"+buffer.limit());
		buffer.flip();
		//System.out.println("重置以后----位置指针"+buffer.position()+"容量大小指针"+buffer.capacity()+"分割指针"+buffer.limit());
		while(buffer.hasRemaining()) {
			System.out.println(buffer.get());

		}
		buffer.clear();
	}
}
