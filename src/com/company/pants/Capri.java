package com.company.pants;

public class Capri implements Pants {
    @Override
    public void putOn() {
        System.out.println("Надевает капри");
    }

    @Override
    public void putOut() {
        System.out.println("Снимает капри");
    }
}
