//Sonic is a type of Critter and implements the Talker interface
class Sonic extends Critter implements Talker{
    private static double default_cost = 99.9;
    private static double markup_price = 5.99;
    private static double cutoff = 25.99;

    //setters for the default values
    public static void setDefault_cost(int cost){
        default_cost=cost;
    }

    public static void setMarkup_price(int price){
        markup_price=price;
    }

    public static void setCutoff(int cut){
        cutoff=cut;
    }


    //overriding the Talker interface methods
    @Override
    public String sayHi() {
        return "Good day fellow traveler";
    }
    @Override
    public String sayBye() {
        return "Have a nice day";
    }

    //takes a string as the name and a double as the price of the object
    public Sonic(String name, double price) {
        super(name, price);
    }

    //uses the default values to create a new object
    public Sonic() {
        super();
        this.setName("Sonic Toy");
        this.price = default_cost;
    }

    //calculates the price by adding the user defined markup price to its previous price
    public double CalculatePrice(double markup_value) {
        double final_price = super.calculatePrice() + markup_value;
        return final_price;
    }

    public double CalculatePrice() {
        if (price < cutoff) {
            price = this.CalculatePrice(markup_price);
        }
        return price;
    }
}