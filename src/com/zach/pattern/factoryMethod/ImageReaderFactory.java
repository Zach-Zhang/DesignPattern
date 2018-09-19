package com.zach.pattern.factoryMethod;
/**
 * 抽象图片读取器工厂接口
 * @author Zach
 *
 */
public interface ImageReaderFactory {
	
	public ImageReader createImageReader();
	/**
	 * 对客户端隐藏工厂方法
	 */
	public default void readImage(){
		ImageReader imageReader = this.createImageReader();
		imageReader.readImage();
	}
}
