public class PricedProduct extends Product {
    double price;

    void setPrice(double price)
    {
        this.price = price;
    }
    double getPrice()
    {
return price;
    }
    public static void main(String args[])
    {
        PricedProduct ameer = new PricedProduct();
        ameer.setProductName("Sameer");
        ameer.setPrice(3.4);
        System.out.println(ameer.getPrice());
        System.out.println(ameer.getProductName());
    }
    /* Create a main method, create object, using object, call methods of product class and product
    and price product class.
     */
}
