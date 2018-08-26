package com.zach.pattern.state.share;

/**
 * @Author:Zach
 * @Description:
 * @Date:Created in 16:05 2018/8/6
 * @Modified By:
 */
public class Client {
    public static void main(String[] args){
        Switch s1 = new Switch("开关1");
        Switch s2 = new Switch("开关2");

        s1.on();
        s2.on();
        s1.off();
        s2.off();
        s2.on();
        s1.on();
    }
}
