package org.example;

public class Suv implements Driveable, Parkable {
    private String brand;
    private int speed;
    private boolean parked;

    public Suv(String brand, int speed) {
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
        System.out.println("Внедорожник " + brand + " едет по трассе/бездорожью со скоростью " + speed + " км/ч");
    }

    @Override
    public void brake() {
        speed = 0;
        System.out.println("Внедорожник " + brand + " затормозил");
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void park() {
        brake();
        parked = true;
        System.out.println("Внедорожник " + brand + " встал на парковку");
    }

    @Override
    public boolean isParked() {
        return parked;
    }
}