package com.burger.bill;

import java.util.ArrayList;
import java.util.List;

public class BaseHamberger {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRolltype() {
        return rolltype;
    }

    public void setRolltype(String rolltype) {
        this.rolltype = rolltype;
    }

    public boolean isMeat() {
        return meat;
    }

    public void setMeat(boolean meat) {
        this.meat = meat;
    }



    private String name;
    private String rolltype;
    private boolean meat;

    public BaseHamberger(String name, String rolltype)
    {
        this.name=name;
        this.rolltype=rolltype;
        this.meat=meat;
    }
   public List<Boolean> additionalItem= new ArrayList<Boolean>();
    double addedItemPrice=10;
    public void addAdditionalItems(boolean lettuce, boolean tomato, boolean carrot, boolean cheese){
        if(lettuce == true){
            additionalItem.add(lettuce);
        }
        if(tomato == true){
            additionalItem.add(tomato);
        }
        if(carrot == true){
            additionalItem.add(carrot);
        }
        if(cheese == true){
            additionalItem.add(cheese);
        }
    }





}



