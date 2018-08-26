package com.zach.pattern.state.context;

/**
 * @Author:Zach
 * @Description:
 * @Date:Created in 16:56 2018/8/6
 * @Modified By:
 */
public class Client {
    public static void main(String[] args){
        Screen screen = new Screen();
        screen.onClick();
        screen.onClick();
        screen.onClick();
        
    }
}
