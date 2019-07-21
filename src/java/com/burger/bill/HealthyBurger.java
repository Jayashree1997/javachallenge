package com.burger.bill;

public class HealthyBurger extends BaseHamberger {
    public HealthyBurger(String name, String rolltype) {
        super(name, rolltype);
    }
    public void addAdditional(boolean olive,boolean capsicum){
        if(olive==true){
            additionalItem.add(olive);
        }
        if(capsicum==true){
            additionalItem.add(capsicum);
        }
    }
//    @Override
//    public double finalPrice(){
//        return super.finalPrice();
//    }
//    @Override
//    public double additionalPrice(){
//        return super.additionalPrice();
//    }
//    @Override
//    public double getBasePrice() {
//        return super.getBaseprice();
//    }
}


