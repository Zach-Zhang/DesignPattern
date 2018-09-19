package com.zach.pattern.factoryMethod;
/**
 * GIF读取器工厂
 * @author Zach
 *
 */
public class GifFactory implements ImageReaderFactory {

	@Override
	public ImageReader createImageReader() {
		
		return new GifReader();
	}

}
