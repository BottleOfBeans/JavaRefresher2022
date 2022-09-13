public class FlowerWorker
{
    private Flower[] list;
    /**
     * Create a new array, and copy everything from flowerList into
     * the new array.
     */
    Flower flowerArray[];

    public FlowerWorker(Flower[] flowerList)
    {
        flowerArray = new Flower[flowerList.length];
        for(int x=0; x< flowerArray.length; x++){
            flowerArray[x] = flowerList[x];
        }
    }

    /**
     * Returns the index of the first Flower in list with the given name
     * if there are no matching Flowers, return -1
     */
    public int indexOf(String name)
    {
        for(int x=0; x< flowerArray.length; x++){
            if(flowerArray[x].name==name){
                return(x);
            }
        }
        return -1;
    }

    /**
     * If a Flower with the given name exists in list, and newPrice is valid
     * update the price to newPrice and return true
     *
     * If the list is unchanged, return false
     */
    public boolean setPrice(String name, int newPrice)
    {
        for(int x=0; x< flowerArray.length; x++){
            if(flowerArray[x].name==name){
                return flowerArray[x].setPrice(newPrice);
            }
        }
        return false;
    }

    /**
     * Prints all flowers in list that have a price less than
     * or equal to maxPrice
     * Use the toString method to print a Flower
     */
    public void printLessThan(double maxPrice)
    {
        for(int x=0; x< flowerArray.length; x++){
            if(flowerArray[x].price<=maxPrice){
                System.out.println(flowerArray[x].toString());
            }
        }
    }

    /**
     * Return a String containing all of the Flowers in the list
     * Use the toString of the Flower in here
     */
    public String toString()
    {
        String everybody = " ";
        for(int x=0; x< flowerArray.length; x++){
            everybody += flowerArray[x].name+" ";
        }
        return everybody;
    }

    /**
     * SAVE THIS FOR LAST
     *
     * Removes the first time a Flower with the given name
     * appears in list, and returns true. This means list
     * has a shorter length than before
     *
     *
     * If there is no Flower with the given name, return false
     * and do not change the array
     *
     */
    public boolean remove(String name)
    {
        return true;
    }
}