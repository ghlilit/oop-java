//FloofyLoop is a type of DooToros and extends the DooToros class. It also implements Locomote interface.
class FloofyLoop extends DooToros implements Locomote {

    //creates FloofyLoop objects the same way as in the parent class.
    public FloofyLoop(String name, int minAge) {
        super(name, minAge);
    }

    public FloofyLoop(String name) {
        super(name);
    }

    public FloofyLoop(int minAge) {
        super(minAge);
    }

    //overriding Locomote interface's functions
    @Override
    public int howFar() {
        return 5;
    }

    @Override
    public String style() {
        return "Roll";
    }

    //calculates the price like in the DooToros class
    public double calculatePrice() {
        price = super.calculatePrice();
        return price;
    }

    //accepts an integer argument that is then multiplied by howFar() value
    public double calculatePrice(int integer) {
        price = this.howFar() * integer;
        return price;
    }

    //adds For all ages when printed
    @Override
    public String toString() {
        String half = super.toString();
        String line = "\n For All Ages";
        return half + line;

    }
}