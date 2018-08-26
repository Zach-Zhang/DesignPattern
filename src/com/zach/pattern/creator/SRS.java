package com.zach.pattern.creator;

//软件需求规格说明书
public class SRS implements OfficialDocument {

	@Override
	public OfficialDocument clone() {
		// TODO Auto-generated method stub
		OfficialDocument srs = null;
		try {
			srs = (OfficialDocument) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return srs;
	}

	@Override
	public void display() {
		System.out.println("软件需求规格说明书");

	}

}
