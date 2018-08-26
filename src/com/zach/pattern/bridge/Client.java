package com.zach.pattern.bridge;

//客户端代码
public class Client {
	public static void main(String[] args) {
		
		//为了扩展性,可通过配置文件配置具体扩充抽象类和具体实现类
		try {
			Image image = (Image) Class.forName("com.zach.pattern.bridge.JPGImage").newInstance();
			ImageImp imp = (ImageImp) Class.forName("com.zach.pattern.bridge.WindowsImp").newInstance();
			image.setImageImp(imp);
			image.parseFile("小龙女");
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
