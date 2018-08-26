package com.zach.pattern.state.share;

/**
 * @Author:Zach
 * @Description:
 * @Date:Created in 15:43 2018/8/6
 * @Modified By:
 */
public class OnState extends State {
    @Override
    public void on(Switch s) {
        System.out.println("已经打开!");
    }

    @Override
    public void off(Switch s) {
    System.out.println("关闭");
    s.setState(Switch.getState("off"));
    }
}
