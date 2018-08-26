package com.zach.pattern.state.share;

/**
 * @Author:Zach
 * @Description:
 * @Date:Created in 15:40 2018/8/6
 * @Modified By:
 */
public abstract  class State {
    public abstract void on(Switch s);
    public abstract void off(Switch s);
}
