package org.example;

public class Sedan implements Driveable, Parkable {
    private String brand;
    private int speed;
    private boolean parked;

    public Sedan(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        this.parked = false;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void drive() {
        parked = false;
        System.out.println("Седан " + brand + " едет со скоростью " + speed + " км/ч");
    }

    @Override
    public void brake() {
        speed = 0;
        System.out.println("Седан " + brand + " остановился");
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void park() {
        brake();
        parked = true;
        System.out.println("Седан " + brand + " успешно припаркован");
    }

    @Override
    public boolean isParked() {
        return parked;
    }
}