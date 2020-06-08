package com.company.jacket;

public class Slicker implements Jacket {

    @Override
    public void putOn() {
        System.out.println("Надевает дождевик");
    }

    @Override
    public void putOut() {
        System.out.println("Снимает дождевик");
    }


}
