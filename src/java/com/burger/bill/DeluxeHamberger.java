package com.burger.bill;

public class DeluxeHamberger extends BaseHamberger{
    public DeluxeHamberger(String name, String rolltype) {
        super(name, rolltype);
    }

    public void addAdditional(boolean drinks,boolean chips){
        if(drinks==true){
            additionalItem.add(drinks);
        }
        if(chips==true){
            additionalItem.add(chips);
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

}
