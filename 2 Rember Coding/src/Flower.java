//We doing it on that working grindset
public class Flower {
    /**
     * name is the name of the flower it is inputted when called
     *price is the price of the flower it is defaulted at 0 but can be set
     */
    public String name;
    public double price;

    /**
     * Setting it all up
     * @param gname input name
     * @param gprice input price
     */
    public Flower(String gname, double gprice) {
        name = gname;
        price = gprice;
    }

    /**
     * Setting it up without price -> default is 0
     * @param gname input name
     */
    public Flower(String gname){
        name = gname;
        price = 5;
    }

    /**
     * Returning the price when asked
     * @return
     */
    public double price(){
        return price;
    }

    /**
     * Returning the name when asked
     * @return
     */
    public String name(){
        return name;
    }

    /**
     * updates the price of the
     * Flower to newPrice and returns true
     * ONLY if newPrice is positive
     * otherwise return false
     * @param newPrice the new price that it should be set too
     * @return
     */
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

    /**
     * returns a String in the following format:
     * ex: "Flower Name: Tulip, Price: $5.0"
     * @return
     */
    public String toString(){
        return "\nFlower  Name: "+name+", Price: $"+price;
    }

}