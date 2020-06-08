package com.company.footwear;

public class Shoes implements Footwear {
    @Override
    public void putOn() {
        System.out.println("Надевает туфли");
    }

    @Override
    public void putOut() {
        System.out.println("Снимает туфли");
    }
}
