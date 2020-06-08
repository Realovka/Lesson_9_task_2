package com.company.pants;

public class Leggings implements Pants {
    @Override
    public void putOn() {
        System.out.println("Надевает леггинцы");
    }

    @Override
    public void putOut() {
        System.out.println("Снимает леггинцы");
    }
}
