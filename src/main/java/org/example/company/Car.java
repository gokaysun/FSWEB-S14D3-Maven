package org.example.company;

import java.util.Objects;

public class Car {
private boolean engine;
private int cylinders;
private String name;
private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true; // hepsinde motor var
        this.wheels = 4; // hepsinde 4 teker var
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return cylinders == car.cylinders &&
                Objects.equals(name, car.name);
    }
    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }
    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";
    }
    public String brake() {
        System.out.println(getClass().getSimpleName());
        return "the car is braking";    }
}
