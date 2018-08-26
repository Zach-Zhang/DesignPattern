package com.zach.pattern.state.share;

/**
 * @Author:Zach
 * @Description:
 * @Date:Created in 15:39 2018/8/6
 * @Modified By:
 */
public class Switch {

    private static State state,onState,offState;
    private String name;

    public Switch(String name) {
        this.name = name;
        onState = new OnState();
        offState = new OffState();
        this.state = onState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public static State getState(String type) {
        if("on".equals(type)){
            return onState;
        }else {
            return offState;
        }
    }

    //打开开关
    public void on(){
        System.out.println(name);
        state.on(this);
    }

    //关闭开关
    public void off() {
        System.out.println(name);
        state.off(this);
    }
}
