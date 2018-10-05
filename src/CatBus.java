//CatBus is a type of DooToros. It moves and talks so it implements Locomote and Talker interfaces
class CatBus extends DooToros implements Locomote, Talker {

    private int distance;
    private static int min_distance = 5;


    public CatBus(String name, int distance) {
        super(name);
        this.distance = distance;
        //If the distance is less than some minimum value -
        //currently set to 5- then the minimum age for this widget is set to the default for DooToros. Otherwise,
        //the minimum age is set to −1
        if (distance < min_distance) {
            minAge = def_age;
        } else {
            minAge = -1;
        }
    }
    //CatBus can be created by providing a name, distance, and a minimum age. In this case, the values are
    //recorded directly and no adjustment of the distance is required.

    public CatBus(String name, int minAge, int distance) {
        super(name, minAge);
        this.distance = distance;
    }

    //overriding the functions from Talker and Locomote interfaces
    @Override
    public int howFar() {
        return distance;
    }

    @Override
    public String style() {
        return "Saunter";
    }

    @Override
    public String sayHi() {
        return "Hi";
    }

    @Override
    public String sayBye() {
        return "Bye Bye";
    }

    @Override
    //When printing CatBus object if the stored minimum age is −1, then we add “Age: unrestricted” to the regular Widget
    //printout. Otherwise, we add “Age: minAge and above”, where minAge is the stored minimum age value.
    public String toString() {
        String half = super.toString();
        if (this.minAge == -1) {
            String line3 = " \n Age Unrestricted";
            return half + line3;
        } else {
            String line3 = " \n Age:" + this.minAge + " and above";
            return half + line3;
        }

    }
}