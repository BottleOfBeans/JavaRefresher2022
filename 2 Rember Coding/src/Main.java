public class Main
{
    public static void main(String[] args)
    {
        /**
         * Uncomment each section as you complete the program
         * Check the README file to see what this should
         * output when you are done
         */

       Flower[] flowers = {
           new Flower("Tulip"),
           new Flower("Rose", 6.5),
           new Flower("Dandelion", 0.5),
           new Flower("Carnation", 1),
           new Flower("Lilly", 4) };

       System.out.println("TEST 1");
       System.out.println(flowers[0].price());
       System.out.println(flowers[1].setPrice(-2));
       System.out.println(flowers[1]);



       FlowerWorker fw = new FlowerWorker(flowers);

       System.out.println("\nTEST 2");
       System.out.println(fw);



       System.out.println("\nTEST 3");
       System.out.println(fw.indexOf("Carnation"));
       System.out.println(fw.indexOf("Sunflower"));



       System.out.println("\nTEST 4");
       fw.setPrice("Lilly", 3);
       fw.printLessThan(3);



       System.out.println("\nTEST 5");
       fw.remove("Dandelion");
       System.out.println("\n+"+fw);

    }
}