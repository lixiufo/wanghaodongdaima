package com.ee;

import java.io.IOException;
import java.util.Properties;

public class Runm {
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().freeMemory());
		System.out.println(Runtime.getRuntime().totalMemory());
		try {
			Runtime.getRuntime().exec("\"D:\\Program Files (x86)\\WeGame\\tgp_daemon.exe\"");
		} catch (IOException e) {
			Runtime.getRuntime().exit(1);
			e.printStackTrace();
		}

		Runtime.getRuntime().exit(0);
	}

//	Properties p=System.getProperties();
//	System.out.println(p.get("os.name"));
//	System.out.println(p.get("java.home"));;
//	System.out.println(p.get("user.dir"));
//	System.out.println(p.get("os.version"));

}






