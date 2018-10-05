/*
Ridge Fluffy Dev widget management system
Author: Ghandilyan Lilit
Created: 9/9/2018
Last modified: 9/13/2018
This is Ridge Fluffy Dev Corporation's Data Management System.


*/

//Widget is the parent class for all the widgets.
abstract class Widgets {

    private String name;
    protected double price;


    //takes a string as an input to set the name
    public void setName(String name) {
        this.name = name;
    }


    //returns the private name variable.
    public String getName() {
        return name;
    }

    //abstract function to be inherited by all its child classes. Returns the price of the widget, a double.
    protected abstract double calculatePrice();


    //prints the name and the price of the widget
    @Override
    public String toString() {
        String line1 = "** Ridge Fluffy Dev **\n";
        String line2 = "name:" + name + ": price:" + price;
        return line1 + line2;
    }
}