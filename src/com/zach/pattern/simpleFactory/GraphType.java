package com.zach.pattern.simpleFactory;

/**
 * @Author:Zach
 * @Description:  简单工厂模式的实现
 * @Date:Created in 15:32 2018/9/17
 * @Modified By:
 */
public enum GraphType {

    CYCLE("cycle"),RECTANGLE("rectangle"),TRIANGLE("triangle");

    private String title;

    GraphType(String title) {
        this.title = title;
    }
}
