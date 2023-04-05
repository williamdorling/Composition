package air;

import parts.IPart;
import products.IProduct;

public class Radar implements IPart {

    private String manufacturer;
    private long partNumber;
    private double range;
    private IProduct baseProduct;

    public Radar(String manufacturer, long partNumber, double range, IProduct baseProduct){
        this.manufacturer = manufacturer;
        this.partNumber = partNumber;
        this.range = range;
        this.baseProduct = baseProduct;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public long getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(long partNumber) {
        this.partNumber = partNumber;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
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
