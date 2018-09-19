package com.zach.pattern.factoryMethod;

public class GifFactory implements ImageReaderFactory {

	@Override
	public ImageReader createImageReader() {
		
		return new GifReader();
	}

}
