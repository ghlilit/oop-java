//Critters are the second type of Widgets made for adults.
class Critter extends Widgets {
    private static double markup_price = 25.99;

    //setter for the markup price
    public static void setMarkup_price(int price){
        markup_price = price;
    }

    //Sonic class needs to inherit a class with no parameters
    public Critter(){}

    //constructor which accepts the name as a string and the price as a double
    public Critter(String name, double price) {
        this.setName(name);
        this.price = price;
    }

    //calculates the price adding the default markup price to the manufacturing cost. returns the price
    public double calculatePrice() {
        return price + markup_price;
    }
    //calculates the sale price as the regular price for a Critter +20% − 10% (the dumb method).
    public double calculateSalePrice() {
        return price + 0.2 * price - 0.1 * price;
    }
}
