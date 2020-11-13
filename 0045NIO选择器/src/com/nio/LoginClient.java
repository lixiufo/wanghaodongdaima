package com.nio;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class LoginClient {
	public static void main(String[] args) throws Exception{
		
			SocketChannel channel= SocketChannel.open();
			channel.connect(new InetSocketAddress(ServerInfo.HOST_NAME, ServerInfo.PORT));
			ByteBuffer buffer=ByteBuffer.allocate(100);
			while(true) {
				buffer.clear();
				String message=InputUtil.getInput("«Î ‰»Îƒ⁄»›");
				buffer.put(message.getBytes());
				buffer.flip();
				channel.write(buffer);
				buffer.clear();
				int count=channel.read(buffer);
				System.out.println(new String(buffer.array(),0,count));
				if("exit".equals(message)) {
					break;
				}
			}
		
			channel.close();
		}
	}
	