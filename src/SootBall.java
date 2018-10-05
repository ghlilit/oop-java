//SootBall is the third DooToro widget and a type of CatBus
class SootBall extends CatBus{
    private static double fixed_add_cost = 4.15;
    private static double default_price = 9.99;

    //setters for the default values
    public static void setFixed_add_cost(int cost){
        fixed_add_cost = cost;
    }

    public static void setDefault_price(int price){
        default_price = price;
    }
    //constructor accepts String as a name and int as minimum age and distance
    public SootBall(String name, int distance, int minAge) {
        super(name, distance);
        this.minAge = minAge;

    }

    public String style() {
        return "Jump";
    }

    //calculates the price of the sootball object
    // If the cost of the SootBall widget is
    //greater than 100, then the price of a SootBall is equal to a default price of 9.99 (subject to change). If
    //the calculation is less than 100, then we simply return this value as the price
    public double calculatePrice() {
        price = super.calculatePrice();
        if (price > 100) {
            price = default_price;
        }
            return price;
    }

}