package com.burger.bill;

public class Mainclass {
    public static void main(String[] args){
        BaseHamberger burger=new BaseHamberger("Vegberger","Vegroll");
        burger.finalPrice();
        burger.additionalPrice();
        DeluxeHamberger dburger= new DeluxeHamberger("NonVegburger","ChickenRoll");
        dburger.finalPrice();
        dburger.additionalPrice();
        HealthyBurger hburger=new HealthyBurger("Oliveberger","sesameroll");
        hburger.finalPrice();
        hburger.additionalPrice();
    }
}
