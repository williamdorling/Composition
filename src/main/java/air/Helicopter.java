package air;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class Helicopter extends Vehicle implements IAirVehicle, IMotorised {

    private double maxAltitude;

    public Helicopter(float weight, int maxSpeed, IProduct baseProduct, double maxAltitude){
        super(weight, maxSpeed,baseProduct);
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

    @Override
    public void startEngine() {
        
    }

    @Override
    public void stopEngine() {

    }

    @Override
    public int getHp() {
        return 0;
    }

    @Override
    public void setHp(int hp) {

    }

    @Override
    public int getFuel() {
        return 0;
    }

    @Override
    public void setFuel(int fuel) {

    }
}
