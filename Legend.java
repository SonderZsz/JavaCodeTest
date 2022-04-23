package com.bilibili.a;

public class Legend {
    String name;
    String form;
    int hp;
    int atk;
    String Q;
    String W;
    String E;
    String R;

    public Legend(String name,int hp){
        this.name = name;
        this.hp = hp;
    }

    public Legend(String name,String form,int hp,int atk,String Q,String R){
        this(name, hp);
        this.atk = atk;
        this.Q = Q;
        this.R = R;
        this.form = form;
    }

    public void Q(){
        System.out.println("盖伦发起冲锋并强化下一次普通攻击！");
    }

    public static void main(String[] args) {
        Legend GaiLun = new Legend("盖伦","战士",750,
                75,"小宝剑","大宝剑");
        GaiLun.Q();
        System.out.println(GaiLun.Q);
    }
}
