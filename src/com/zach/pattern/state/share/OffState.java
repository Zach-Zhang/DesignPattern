package com.zach.pattern.state.share;

/**
 * @Author:Zach
 * @Description:
 * @Date:Created in 15:51 2018/8/6
 * @Modified By:
 */
public class OffState extends  State {
    @Override
    public void on(Switch s) {
        System.out.println("打开");
        s.setState(Switch.getState("on"));
    }

    @Override
    public void off(Switch s) {
        System.out.println("已经关闭!");
    }
}
