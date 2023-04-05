package parts;

import products.IProduct;

public interface IPart extends IProduct {

    String getManufacturer();
    void setManufacturer(String manufacturer);
    long getPartNumber();
    void setPartNumber(long partNumber);

}
