package com.zach.pattern.factoryMethod;

public class JpgFactory implements ImageReaderFactory {

	@Override
	public ImageReader createImageReader() {
		
		return new JpgReader();
	}

}
