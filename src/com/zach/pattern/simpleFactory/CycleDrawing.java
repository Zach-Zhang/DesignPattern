package com.zach.pattern.simpleFactory;

/**
 * @Author:Zach
 * @Description:
 * @Date:Created in 15:40 2018/9/17
 * @Modified By:
 */
public class CycleDrawing implements Geometry {

    @Override
    public String toString() {
        return "CycleDrawing";
    }

    @Override
    public void draw() {
        System.out.println("画了一个圆");
    }

    @Override
    public void erase() {
        System.out.println("擦掉了一个圆");
    }

}
