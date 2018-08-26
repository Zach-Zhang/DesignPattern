package com.zach.pattern.facade;

//客户端
public class Client {
	public static void main(String[] args) {
		EncryptFacade ef = new EncryptFacade();
		ef.fileEncrypt("facade/src.txt", "facade/des.txt");
	}
}
