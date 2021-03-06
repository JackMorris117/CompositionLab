package Vehicles;

import Components.ElectricMotor;
import Components.Engine;
import Interfaces.ICost;

public class HybridCar extends Vehicle {
    String colour;
    Engine engine;
    ElectricMotor motor;

    public HybridCar(String name, Double price, String colour, Engine engine, ElectricMotor motor) {
        super(name, price, 0);
        this.colour = colour;
        this.engine = engine;
        this.motor = motor;
    }

    public double cost(){
        return this.getPrice() + engine.cost() + motor.cost();
    }
}

