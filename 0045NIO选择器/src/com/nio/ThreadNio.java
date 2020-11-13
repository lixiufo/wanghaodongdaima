package com.nio;

import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class ThreadNio implements Runnable {
	private SocketChannel socketChannel;
	private boolean flag=true;
	public ThreadNio(SocketChannel socketChannel) {
		this.socketChannel=socketChannel;
	}

	@Override
	public void run() {
		ByteBuffer buffer=ByteBuffer.allocate(100);
		try {
			while(flag) {
				buffer.clear();
				int count=this.socketChannel.read(buffer);
				String  readMessae=new String(buffer.array(),0,count);
				System.out.println("[�ͻ��˷��͵���Ϣ��]"+readMessae);
				String wirteMessage="[���������͵���Ϣ]"+readMessae;
				if("exit".equalsIgnoreCase(readMessae)) {
					System.out.println("[�ݰ��]");
				flag=false;
				}
				buffer.clear();
				buffer.put(wirteMessage.getBytes());
				buffer.flip();
				this.socketChannel.write(buffer);
			}
			this.socketChannel.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
