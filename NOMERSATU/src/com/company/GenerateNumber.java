package com.company;

import java.util.Random;

public class GenerateNumber {
    private Random rand= new Random();
    private int gen=rand.nextInt (5)+1;
    public GenerateNumber (){

    }
    public Random getRand (){
        return rand;

    }
    public void setRand () {
        this.rand=rand;
    }
    public int getGen (){
        return gen;
    }
    public void setGen (int gen){
        this.gen=gen;
    }
}
