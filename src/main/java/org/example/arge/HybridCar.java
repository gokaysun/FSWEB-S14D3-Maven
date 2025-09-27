package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;
    private int batterySize;

    public HybridCar(String name, String description, double avgKmPerLitre, int cylinders, int batterySize) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + ": Hybrid engine starting (cylinders " + cylinders + ", battery " + batterySize + ")");
    }

    @Override
    public void drive() {
        System.out.println(getName() + " is driving using hybrid engine");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println(getName() + " hybrid engine running: " + avgKmPerLitre + " km/l and battery " + batterySize);
    }
}
