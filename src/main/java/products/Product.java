package products;

public final class Product implements IProduct{
    private float price;
    private long inventory;
    private String title;

    public Product(float price, long inventory, String title){
        this.price = price;
        this.inventory = inventory;
        this.title = title;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public long getInventory() {
        return this.inventory;
    }

    @Override
    public void setInventory(long amount) {
        this.inventory = inventory;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    @Override
    public void addInventory(long amount) {
        this.inventory += amount;
    }

    @Override
    public void removeInventory(long amount) {
        if(this.inventory - amount >= 0){
            this.inventory -= amount;
        }
    }
}
