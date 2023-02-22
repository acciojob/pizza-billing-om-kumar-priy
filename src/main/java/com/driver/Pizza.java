package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean isextracheese;
    boolean isExtraToppings;
    boolean isTakeaway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            this.price=300;
            this.bill="Base Price Of The Pizza: 300\n";
        }
        else
        {
            this.price=400;
            this.bill="Base Price Of The Pizza: 400\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!isextracheese)
        {
            isextracheese=true;

            this.price+=80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppings)
        {
            isExtraToppings=true;
            if(isVeg)
                this.price+=70;
            else   this.price+=120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeaway)
        {
            isTakeaway=true;
            this.price+=20;
        }
    }

    public String getBill(){
        // your code goes here
        if (isextracheese)
            this.bill+="Extra Cheese Added: 80\n";

        if(isExtraToppings)
        {
            if(isVeg)

                bill+="Extra Toppings Added: 70\n";
            else  bill+="Extra Toppings Added: 120\n";
        }
        if(isTakeaway)
            bill +="Paperbag Added: 20\n";
        this.bill +="Total Price: "+ this.price+"\n";

        return this.bill;
    }
}
