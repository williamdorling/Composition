package vehicles;

import products.IProduct;

public interface IVehicle extends IProduct {

    float getWeight();
    void setWeight(float weight);
    int getMaxSpeed();
    void setMaxSpeed(int maxSpeed);

}
