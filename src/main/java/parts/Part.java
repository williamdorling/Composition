package parts;

import products.IProduct;

public final class Part implements IPart{

    private String manufacturer;
    private long partNumber;
    private IProduct baseProduct;

    public Part(String manufacturer, long partNumber, IProduct baseProduct){
        this.manufacturer = manufacturer;
        this.partNumber =  partNumber;
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

    @Override
    public long getPartNumber() {
        return partNumber;
    }

    @Override
    public void setPartNumber(long partNumber) {
        this.partNumber = partNumber;
    }

    public IProduct getBaseProduct() {
        return baseProduct;
    }

    public void setBaseProduct(IProduct baseProduct) {
        this.baseProduct = baseProduct;
    }

    @Override
    public float getPrice() {
        return this.baseProduct.getPrice();
    }

    @Override
    public void setPrice(float price) {
        this.baseProduct.setPrice(price);
    }

    @Override
    public long getInventory() {
        return this.baseProduct.getInventory();
    }

    @Override
    public void setInventory(long amount) {
        this.baseProduct.setInventory(amount);
    }

    @Override
    public String getTitle() {
        return this.baseProduct.getTitle();
    }

    @Override
    public void setTitle(String newTitle) {
        this.baseProduct.setTitle(newTitle);
    }

    @Override
    public void addInventory(long amount) {
        this.baseProduct.addInventory(amount);
    }

    @Override
    public void removeInventory(long amount) {
        this.baseProduct.removeInventory(amount);
    }
}
