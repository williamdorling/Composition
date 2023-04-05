package products;

public interface IProduct {

    float getPrice();
    void setPrice(float price);
    long getInventory();
    void setInventory(long amount);
    String getTitle();
    void setTitle(String newTitle);
    void addInventory(long amount);
    void removeInventory(long amount);

}
