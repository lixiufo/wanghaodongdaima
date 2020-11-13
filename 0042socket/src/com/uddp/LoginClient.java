package com.uddp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class LoginClient {
	public static void main(String[] args) {
		try {
			DatagramSocket ds=new DatagramSocket();
			String info="你真是个大好人啊";
			byte[]datas=info.getBytes();
			try {
				InetAddress address= InetAddress.getByName("localhost");
				DatagramPacket dp=new DatagramPacket(datas,  datas.length, address,8899);
				try {
					ds.send(dp);
					//接收数据 先准备大袋子  
					byte [] newDatas=new byte[1024];
					DatagramPacket dp1=new DatagramPacket(newDatas, newDatas.length);
					ds.receive(dp1);
					System.out.println("服务器说的话是："+new String(dp1.getData(),0,dp1.getData().length));
					ds.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
