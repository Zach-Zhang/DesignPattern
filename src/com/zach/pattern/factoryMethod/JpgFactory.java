package com.zach.pattern.factoryMethod;
/**
 * jpg读取器工厂
 * @author Zach
 *
 */
public class JpgFactory implements ImageReaderFactory {

	@Override
	public ImageReader createImageReader() {
		
		return new JpgReader();
	}

}
