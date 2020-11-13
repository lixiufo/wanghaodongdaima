package com.nio;

import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerClient  {
	public void start() throws Exception{
		ExecutorService threadPool=Executors.newFixedThreadPool(20);
		ServerSocketChannel serverSocketChannel=ServerSocketChannel.open();
		serverSocketChannel.configureBlocking(false);
		serverSocketChannel.bind(new InetSocketAddress(ServerInfo.PORT));
		Selector select =Selector.open();
		serverSocketChannel.register(select, SelectionKey.OP_ACCEPT);
		int requestStatus=0;
		while((requestStatus=select.select())>0) {
			Set<SelectionKey> selectedKeys = select.selectedKeys();

			Iterator<SelectionKey> iterator = selectedKeys.iterator();
			while(iterator.hasNext()) {
				SelectionKey next = iterator.next();
				if(next.isAcceptable()) {
					SocketChannel  socketChannel=serverSocketChannel.accept();
					if(socketChannel!=null) {
						threadPool.submit(new ThreadNio(socketChannel));
					}
				}
			}
		}

		threadPool.shutdown();
		serverSocketChannel.close();

	}
	public static void main(String[] args) throws Exception {
		new ServerClient().start();
	}
}

