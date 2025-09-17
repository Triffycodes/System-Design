package LLD.WithStrategyPattern;

import LLD.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{
    
    NormalVehicle(){
        super(new NormalDriveStrategy());
    }
}
