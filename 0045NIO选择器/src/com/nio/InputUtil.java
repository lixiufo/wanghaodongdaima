package com.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.InflaterInputStream;

public class InputUtil {
public static BufferedReader READER=new BufferedReader(new InputStreamReader(System.in));
public static String getInput(String str) {
	String result="";
	if("".equals(result) || result==null) {
		System.out.println(str);
		try {
			result=READER.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	return result;
}

}
