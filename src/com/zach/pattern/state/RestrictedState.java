package com.zach.pattern.state;

/**
 * @Author:Zach
 * @Description: 受限状态,具体状态类
 * @Date:Created in 14:24 2018/8/6
 * @Modified By:
 */
public class RestrictedState extends AccountState{

    public RestrictedState(AccountState state) {
        this.acc = state.acc;
    }

    @Override
    public void deposit(double amount) {
        acc.setBalance(acc.getBalance()+amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("账号受限,取款失败");
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息!");
    }

    @Override
    public void stateCheck() {
        if (acc.getBalance()>0) {
            acc.setState(new NormalState(this));
        }
        else if (acc.getBalance()>-2000) {
            acc.setState(new OverdraftState(this));
        }
    }
}
