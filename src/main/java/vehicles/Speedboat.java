package vehicles;

import products.IProduct;

public class Speedboat extends Vehicle implements IMotorised, IWaterVehicle{

    private String hullType;
    private IMotorised motor;

    public Speedboat(float weight, int maxSpeed, IProduct baseProduct, String hullType, IMotorised motor){
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
        this. motor = motor;

    }

    @Override
    public String getHullType() {
        return hullType;
    }

    @Override
    public void setHullType(String hullType) {
        this.hullType = hullType;
    }

    public IMotorised getMotor() {
        return motor;
    }

    public void setMotor(IMotorised motor) {
        this.motor = motor;
    }

    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped");
    }

    @Override
    public int getHp() {
        return motor.getHp();
    }

    @Override
    public void setHp(int hp) {
        motor.setHp(hp);
    }

    @Override
    public int getFuel() {
        return motor.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        motor.setFuel(fuel);
    }
}
