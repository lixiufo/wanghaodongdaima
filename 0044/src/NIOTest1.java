import java.nio.ByteBuffer;

public class NIOTest1 {
	public static void main(String[] args) {
		String str="Abcdefg";
		ByteBuffer buffer=ByteBuffer.allocate(20);
		buffer.put(str.getBytes());

		//System.out.println("д������-----λ��ָ��"+buffer.position()+"������Сָ��"+buffer.capacity()+"�ָ�ָ��"+buffer.limit());
		buffer.flip();
		//System.out.println("�����Ժ�----λ��ָ��"+buffer.position()+"������Сָ��"+buffer.capacity()+"�ָ�ָ��"+buffer.limit());
		while(buffer.hasRemaining()) {
			System.out.println(buffer.get());

		}
		buffer.clear();
	}
}
