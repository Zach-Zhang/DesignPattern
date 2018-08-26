package com.zach.pattern.abstractFactory;

//客户端
public class Client {
	public static void main(String[] args) throws Exception {
		
		//为了扩展性可在配置文件中配置具体的工厂类的类名,在此不展示
		SkinFactory factory = (SkinFactory) Class.forName("com.zach.abstractFactory.SpringSkinFactory").newInstance();
		
		Button bt = factory.createButton();
		TextField tf = factory.createTextField();
		ComboBox cb = factory.createComboBox();
		bt.display();
		tf.display();
		cb.display();
		
	}
}
