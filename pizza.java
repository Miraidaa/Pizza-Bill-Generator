public class pizza {
    private int price; 
    private Boolean veg; 


    private int extraCheesePrice = 100; 
    private int extraToppingsPrice = 150; 
    private int bagPackPrice = 20; 
    private int basePizzaPrice; 
    private Boolean isExtraCheeseAdded = false; 
    private Boolean isExtraToppingsAdded=false; 
    private Boolean isTakeAwayOpted = false; 



    public pizza (Boolean veg) {
        this.veg = veg; 

        if(this.veg) {
            this.price = 300; 
        } else {
            this.price = 400; 
        }
        basePizzaPrice = this.price;
    }


    public void addExtraCheese () {
        isExtraCheeseAdded = true; 
        //System.out.println("Extra cheese added");
        this.price += extraCheesePrice;  

    }

    public void addExtraToppings () {
        isExtraToppingsAdded =  true; 
         //System.out.println("Extra toppings added");
        this.price += extraToppingsPrice;  

    }
    

    public void takeAway (){
        isTakeAwayOpted = true; 
         //System.out.println("Take away opted");
        this.price += bagPackPrice; 

    }


    public void getTheBill (){
                String bill = " "; 
                 System.out.println("Pizza" +  basePizzaPrice);

                 if(isExtraCheeseAdded) {
                    bill += "Extra cheese added : " + extraCheesePrice + "\n"; 
                 }

                 if(isExtraToppingsAdded) {
                    bill += "Extra Toppings added :" + extraToppingsPrice + "\n"; 
                 }

                 if(isTakeAwayOpted) {
                    bill += "Take away was opted :" + bagPackPrice + "\n"; 
                 }


                 bill += "Bill: " + this.price; 
                 System.out.println(bill);


    }
}
