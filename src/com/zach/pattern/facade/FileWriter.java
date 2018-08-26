package com.zach.pattern.facade;

import java.io.FileOutputStream;

//文件保存类:子系统类
public class FileWriter {
	public void writer(String encryptStr,String fileNameDes){
		System.out.println("保存密文,写入文件");
		try {
			FileOutputStream outFS = new FileOutputStream(fileNameDes);
			outFS.write(encryptStr.getBytes());
			outFS.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
