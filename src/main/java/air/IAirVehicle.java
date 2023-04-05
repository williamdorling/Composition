package air;

import vehicles.IVehicle;

public interface IAirVehicle extends IVehicle {

    double getMaxAltitude();
    void setMaxAltitude(double altitude);

}
