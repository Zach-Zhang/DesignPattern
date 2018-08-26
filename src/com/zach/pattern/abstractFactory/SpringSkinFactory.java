package com.zach.pattern.abstractFactory;

//Spring皮肤工厂:具体工厂
public class SpringSkinFactory implements SkinFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new SpringButton();
	}

	@Override
	public TextField createTextField() {
		// TODO Auto-generated method stub
		return new SpringTextField();
	}

	@Override
	public ComboBox createComboBox() {
		
		return new SpringComboBox();
	}

}
