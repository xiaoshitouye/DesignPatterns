package com.zereao.factory.extend.simplefactory.demo01.entity;


import com.zereao.factory.extend.simplefactory.demo01.Pizza;

/**
 * @author Zereao
 * @version 2018/07/11  10:10
 */
public class VeggiePizze extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare VeggiePizze...");
    }

    @Override
    public void bake() {
        System.out.println("bake VeggiePizze...");
    }

    @Override
    public void cut() {
        System.out.println("cut VeggiePizze...");
    }

    @Override
    public void box() {
        System.out.println("box VeggiePizze...");
    }
}
