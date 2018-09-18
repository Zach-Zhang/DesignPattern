package com.zach.pattern.simpleFactory;

/**
 * @Author:Zach
 * @Description:
 * @Date:Created in 15:40 2018/9/17
 * @Modified By:
 */
public class TriangleDrawing implements Geometry {
    @Override
    public String toString() {
        return "TriangleDrawing";
    }

    @Override
    public void draw() {
        System.out.println("画了一个三角形");
    }

    @Override
    public void erase() {
        System.out.println("擦除了一个三角形");
    }

}
