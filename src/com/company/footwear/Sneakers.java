package com.company.footwear;

public class Sneakers implements Footwear {
    @Override
    public void putOn() {
        System.out.println("Надевает кроссовки");
    }

    @Override
    public void putOut() {
        System.out.println("Снимает кроссовки");
    }
}
