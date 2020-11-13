import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class NIOTest6 {
public static void main(String[] args) {
	Charset charset=Charset.forName("utf-8");
	CharsetEncoder encoder=charset.newEncoder();
	CharsetDecoder decoder=charset.newDecoder();
	CharBuffer buffer=CharBuffer.allocate(100);
	buffer.put("´ó»µµ°");
	buffer.flip();
	try {
		ByteBuffer byteBuffer=encoder.encode(buffer);
		System.out.println(decoder.decode(byteBuffer));
	} catch (CharacterCodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
