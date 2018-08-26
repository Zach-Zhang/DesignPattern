package com.zach.pattern.abstractFactory;

//Summer皮肤工厂:具体工厂
public class SummerSkinFactory implements SkinFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new SummerButton();
	}

	@Override
	public TextField createTextField() {
		// TODO Auto-generated method stub
		return new SummerTextField();
	}

	@Override
	public ComboBox createComboBox() {
		
		return new SummerComboBox();
	}

}
