package air;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class Helicopter extends Vehicle implements IAirVehicle, IMotorised {

    private double maxAltitude;
    private IMotorised engine;

    public Helicopter(float weight, int maxSpeed, IProduct baseProduct, IMotorised engine,double maxAltitude){
        super(weight, maxSpeed,baseProduct);
        this.engine = engine;
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

    public IMotorised getEngine() {
        return engine;
    }

    public void setEngine(IMotorised engine) {
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        this.engine.startEngine();
    }

    @Override
    public void stopEngine() {
        this.engine.stopEngine();
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
