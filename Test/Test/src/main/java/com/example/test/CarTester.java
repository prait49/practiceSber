package com.example.test;

public class CarTester {
    private boolean goodCar;
    private boolean greatCar;
    private String carInfo;

    public CarTester(boolean goodCar, boolean greatCar, String carInfo) {
        this.goodCar = goodCar;
        this.greatCar = greatCar;
        this.carInfo = carInfo;
    }

    public boolean isGoodCar() {
        return goodCar;
    }

    public void setGoodCar(boolean goodCar) {
        this.goodCar = goodCar;
    }

    public boolean isGreatCar() {
        return greatCar;
    }

    public void setGreatCar(boolean greatCar) {
        this.greatCar = greatCar;
    }

    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }
}
