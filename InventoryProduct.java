public class InventoryProduct extends PricedProduct{
    int quantityStock;

    void setQuantityInStock(int quantityStock)
    {
        this.quantityStock = quantityStock;
    }
    int getQuantityStock()
    {
return quantityStock;
    }

    public static void main(String[] args) {
        InventoryProduct ameer = new InventoryProduct();
        ameer.setQuantityInStock(34);
        System.out.println(ameer.getQuantityStock());
        System.out.println(ameer.quantityStock);
    }
}
