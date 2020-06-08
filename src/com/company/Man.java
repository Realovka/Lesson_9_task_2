package com.company;

import com.company.footwear.Footwear;
import com.company.jacket.Jacket;
import com.company.pants.Pants;


public class Man {
    private String name;
    private Footwear footwear;
    private Pants pants;
    private Jacket jacket;

    public Man(String name, Footwear footwear, Pants pants, Jacket jacket) {
        this.name = name;
        this.footwear = footwear;
        this.pants = pants;
        this.jacket = jacket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Footwear getFootwear() {
        return footwear;
    }

    public void setFootwear(Footwear footwear) {
        this.footwear = footwear;
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public void putOnAll(){
        System.out.println(name);
        footwear.putOn();
        jacket.putOn();
        pants.putOn();

    }

    public void putOutAll() {
        System.out.println(name);
        footwear.putOut();
        jacket.putOut();
        pants.putOut();

    }
}
