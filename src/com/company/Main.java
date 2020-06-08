package com.company;

import com.company.footwear.Boots;
import com.company.footwear.Footwear;
import com.company.footwear.Shoes;
import com.company.footwear.Sneakers;
import com.company.jacket.Cloak;
import com.company.jacket.Jacket;
import com.company.jacket.Slicker;
import com.company.jacket.Windbreaker;
import com.company.pants.Capri;
import com.company.pants.Jeans;
import com.company.pants.Leggings;
import com.company.pants.Pants;

public class Main {

    public static void main(String[] args) {

        Footwear boots=new Boots();
        Footwear shoes = new Shoes();
        Footwear sneakers = new Sneakers();
        Jacket cloak = new Cloak();
        Jacket slicker = new Slicker();
        Jacket windbreaker = new Windbreaker();
        Pants capri = new Capri();
        Pants jeans = new Jeans();
        Pants leggings = new Leggings();

        Man man = new Man ("Том", shoes, jeans, cloak);
        Man man1 = new Man("Джоанна", sneakers, leggings,windbreaker);
        man.putOnAll();
        man.putOutAll();
        man1.putOnAll();
        man1.putOutAll();

    }
}
