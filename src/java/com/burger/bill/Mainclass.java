package com.burger.bill;

public class Mainclass {
    public static void main(String[] args){
        BillPrice billprice=new BillPrice("Vegberger","Vegroll");
        billprice.finalPrice();
        billprice.additionalPrice();
        BaseHamberger burger=new BaseHamberger("Vegberger","Vegroll");
        billprice.finalPrice();
        billprice.additionalPrice();
        DeluxeHamberger dburger= new DeluxeHamberger("NonVegburger","ChickenRoll");
        billprice.finalPrice();
        billprice.additionalPrice();
        HealthyBurger hburger=new HealthyBurger("Oliveberger","sesameroll");
        billprice.finalPrice();
        billprice.additionalPrice();
    }

}
