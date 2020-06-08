package com.company.jacket;

public class Cloak implements Jacket {
    @Override
    public void putOn() {
        System.out.println("Надевает плащ");
    }

    @Override
    public void putOut() {
        System.out.println("Снимает плащ");
    }
}
