package com.zach.pattern.state.context;

/**
 * @Author:Zach
 * @Description: 2倍状态类
 * @Date:Created in 16:35 2018/8/6
 * @Modified By:
 */
public class LargerState extends  State {
    @Override
    public void display() {
        System.out.println("2倍大小!");
    }
}
