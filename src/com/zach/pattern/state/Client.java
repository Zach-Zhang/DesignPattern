package com.zach.pattern.state;

/**
 * @Author:Zach
 * @Description: 客户端类
 * @Date:Created in 14:50 2018/8/6
 * @Modified By:
 */
public class Client {
    public static void main(String[] args){
        Account account = new Account("Zach",0.0);
        account.deposit(1000);
        account.withdraw(2000);
        account.deposit(3000);
        account.withdraw(4000);
        account.withdraw(1000);
        account.computeInterest();
    }
}
