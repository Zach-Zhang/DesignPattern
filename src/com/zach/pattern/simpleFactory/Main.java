package com.zach.pattern.simpleFactory;

/**
 * @Author:Zach
 * @Description: 简单工厂模式的实现
 * @Date:Created in 17:24 2018/9/17
 * @Modified By:
 */
public class Main {

    public static void main(String[] args) {

        Geometry geometry = Geometry.createGeometry(GraphType.CYCLE);
        geometry.draw();
        geometry.erase();
    }
}
