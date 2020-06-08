package com.company.pants;

public class Jeans implements Pants {
    @Override
    public void putOn() {
        System.out.println("Надевает джинсы");
    }

    @Override
    public void putOut() {
        System.out.println("Снимает джинсы");
    }
}
