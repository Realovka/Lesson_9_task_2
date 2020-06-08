package com.company.jacket;

public class Windbreaker implements Jacket {
    @Override
    public void putOn() {
        System.out.println("Надевает ветровку");
    }

    @Override
    public void putOut() {
        System.out.println("Снимает ветровку");
    }
}
