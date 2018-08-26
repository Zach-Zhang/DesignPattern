package com.zach.pattern.bridge;
//Linux操作系统实现类:具体实现类
public class UnixImp implements ImageImp {

	@Override
	public void doPaint(Matrix m) {
		// TODO Auto-generated method stub
		//调用UNIX系统的绘制函数绘制像素矩阵
		System.out.println("在UNIX操作系统中显示图像: ");
	}

}
