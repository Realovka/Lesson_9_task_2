package com.company.footwear;

public class Boots implements Footwear {
    @Override
    public void putOn() {
        System.out.println("Надевает сапоги");
    }

    @Override
    public void putOut() {
        System.out.println("Снимает сапоги");
    }
}
