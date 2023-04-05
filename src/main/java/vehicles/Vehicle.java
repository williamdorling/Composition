package vehicles;

import products.IProduct;

public abstract class Vehicle implements IVehicle{

    private float weight;
    private int maxSpeed;
    private IProduct baseProduct;

    public Vehicle(float weight, int maxSpeed, IProduct baseProduct){
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.baseProduct = baseProduct;
    }

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public IProduct getBaseProduct() {
        return baseProduct;
    }

    public void setBaseProduct(IProduct baseProduct) {
        this.baseProduct = baseProduct;
    }

    @Override
    public float getPrice() {
        return baseProduct.getPrice();
    }

    @Override
    public void setPrice(float price) {
        baseProduct.setPrice(price);
    }

    @Override
    public long getInventory() {
        return baseProduct.getInventory();
    }

    @Override
    public void setInventory(long amount) {
        baseProduct.setInventory(amount);
    }

    @Override
    public String getTitle() {
        return baseProduct.getTitle();
    }

    @Override
    public void setTitle(String newTitle) {
        baseProduct.setTitle(newTitle);
    }

    @Override
    public void addInventory(long amount) {
        baseProduct.addInventory(amount);
    }

    @Override
    public void removeInventory(long amount) {
        baseProduct.removeInventory(amount);
    }
}
