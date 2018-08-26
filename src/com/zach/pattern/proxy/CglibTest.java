package com.zach.pattern.proxy;

public class CglibTest {
	
	public static void main(String[] args) {
		BookFacadeCglib cglib = new BookFacadeCglib();
		BookFacadeImpll bf = (BookFacadeImpll) cglib.getInstance(new BookFacadeImpll());
		bf.addBook();
	}
}
