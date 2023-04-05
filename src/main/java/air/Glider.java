package air;

import products.IProduct;
import vehicles.Vehicle;

public class Glider extends Vehicle implements IAirVehicle {

    private double maxAltitude;

    public Glider(float weight, int maxSpeed, IProduct baseProduct, double maxAltitude){
        super(weight, maxSpeed, baseProduct);
        this.maxAltitude = maxAltitude;
    }

    @Override
    public double getMaxAltitude() {
        return maxAltitude;
    }

    @Override
    public void setMaxAltitude(double maxAltitude) {
        this.maxAltitude = maxAltitude;
    }
}
