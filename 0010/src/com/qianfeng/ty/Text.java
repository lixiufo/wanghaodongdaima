package com.qianfeng.ty;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import com.qianfeng.tt.Student;

public class Text {
    public  String getURLContent() {
        URL url = null;
        BufferedReader in = null;
        StringBuffer sb = new StringBuffer();
        try{
            url = new URL(" https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=ww79b223282c5389d2&corpsecret=ypwRQiE_OHdNXApPV_HHRCu4cPEmlF-qaFZbA1nilg8");
            in = new BufferedReader(new InputStreamReader(url.openStream(),"UTF-8") );
            String str = null;
            //一行一行进行读入
            while((str = in.readLine()) != null) {
                sb.append( str );
            }
        } catch (Exception ex) {

        } finally{
            try{
                if(in!=null) {
                    in.close(); //关闭流
                }
            }catch(IOException ex) {

            }
        }
        System.out.println(sb);
        String result =sb.toString();
        return result;
    }
}
