package com.zach.pattern.facade;

import java.io.FileInputStream;
import java.io.IOException;

//文件读取类:子系统类
public class FileReader {
	
	public String read(String fileNameSrc) {
		System.out.println("读取文件,获取明文: ");
		StringBuffer sb = new StringBuffer();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(fileNameSrc);
			int len= 0;
			while((len=fis.read())!=-1) {
				sb = sb.append((char)len);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(fis !=null) {
				try {
					fis.close();
					System.out.println(sb.toString());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return sb.toString();
	}
}
