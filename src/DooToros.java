//DooToros are a type of Widgets and extend the Widget Class. There are no DooToros objects, so the class is abstract.
abstract class DooToros extends Widgets {

    protected int minAge;
    protected static int def_age = 2;
    private static String def_name = "DooToros";

    //static function to set the default age
    public static void setDef_age(int age){
        def_age = age;
}

    //static function to set the default name
    public static void setDef_name(String name) {
        def_name = name;
    }

    //creates a DooToros object. Takes a string as the name, int as the minimum age.
    public DooToros(String name, int minAge) {
        this.setName(name);
        this.minAge = minAge;
    }

    //creates a DooToros object. Takes a string as the name, setting the age to the default.
    public DooToros(String name) {
        this.setName(name);
        minAge = def_age;
    }

    //creates a DooToros object. Takes an int as the minimum age, setting the name to the default.
    public DooToros(int minAge) {
        this.setName(def_name);
        this.minAge = minAge;
    }

    /*prints the DooToros object. Calculates the price by the formula (|minAge| ∗ 8 ∗ 3x) mod 100
    where x is the number of characters in the DooToros’s user-defined name
    • mod is the modulus operatior (remainder of the division)
    • 8 is an “age factor” that Cerny thinks is useful.
    */
    @Override
    public double calculatePrice() {
        price = (Math.abs(minAge) * 8 * 3 * this.getName().length() % 100);
        return price;
    }
}