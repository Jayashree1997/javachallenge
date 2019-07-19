package com.burger.bill;

public class BillPrice extends BaseHamberger {
    public BillPrice(String name, String rolltype) {
        super(name, rolltype);
    }

    public double getFinalprice() {
        return finalprice;
    }

    public void setFinalprice(double finalprice) {
        this.finalprice = finalprice;
    }

    public double getBaseprice() {
        return baseprice;
    }

    public void setBaseprice(double baseprice) {
        this.baseprice = baseprice;
    }

    private double finalprice;
    private double baseprice;

    public double getAdditionalPrice() {
        return additionalPrice;
    }

    public void setAdditionalPrice(double additionalPrice) {
        this.additionalPrice = additionalPrice;
    }

    private double additionalPrice;
    public double finalPrice(){
        this.finalprice = this.baseprice + this.additionalPrice();
        return this.finalprice;
    }

    public double additionalPrice(){
        this.additionalPrice=this.addedItemPrice*this.additionalItem.size();
        return additionalPrice;

    }
}
