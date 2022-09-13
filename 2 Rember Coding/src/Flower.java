
/**
 * A Flower has a type (represented by a String) and a price (double)
 *
 *
 * It has two constructors:
 *
 * Flower(name, price) - sets the name and price to the parameters
 *
 * Flower(name) - sets the name to the parameter, and the price to 5
 *
 *
 * It has the following methods:
 *
 * double price() - returns the price of the Flower
 *
 * String name() - returns the name of the Flower
 *
 * boolean setPrice(double newPrice) - updates the price of the 
 *                  Flower to newPrice and returns true
 *                  ONLY if newPrice is positive
 *                  otherwise return false
 *
 * String toString() - returns a String in the following format:
 *                     "Flower Name: Tulip, Price: $5.0"
 */

public class Flower {
    public String name;
    public double price;

    public Flower(String gname, double gprice) {
        name = gname;
        price = gprice;
    }
    public Flower(String gname){
        name = gname;
        price = 5;
    }
    public String Flower(){
        return "Flower  Name: "+name+", Price: $"+price;
    }

    public double price(){
        return price;
    }
    public String name(){
        return name;
    }

    public boolean setPrice(double newPrice){
        if(newPrice >= 0){
            price = newPrice;
        }
        if(newPrice <0){
            return false;
        }else{
            return true;
        }
    }
    public String toString(){
        return "Flower  Name: "+name+", Price: $"+price;
    }

}