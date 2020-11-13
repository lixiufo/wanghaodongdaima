package com.uddp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;

public class LoginServer {
	public static void main(String[] args) {
		try {
			DatagramSocket ds=new DatagramSocket(8899);
			byte[] datas=new byte[1024];
			DatagramPacket dp=new DatagramPacket(datas, datas.length);
			try {
				ds.receive(dp);
				System.out.println("接收到的数据是"+new String(dp.getData(),0,dp.getData().length));
				
				String reply="客户端你好";
				SocketAddress sa=dp.getSocketAddress();
				DatagramPacket dp1=new DatagramPacket(reply.getBytes(), reply.getBytes().length, sa);
				ds.send(dp1);
				
				ds.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
