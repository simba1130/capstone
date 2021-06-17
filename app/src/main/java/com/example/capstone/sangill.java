package com.example.capstone;

public class sangill {

   long cars, humans, totalcars, totalhumans;

   public sangill(){}

    public long getCars() {
        return cars;
    }

    public void setCars(long cars) {
        this.cars = cars;
    }

    public long getHumans() {
        return humans;
    }

    public void setHumans(long humans) {
        this.humans = humans;
    }

    public long getTotalcars() {
        return totalcars;
    }

    public void setTotalcars(long totalcars) {
        this.totalcars = totalcars;
    }

    public long getTotalhumans() {
        return totalhumans;
    }

    public void setTotalhumans(long totalhumans) {
        this.totalhumans = totalhumans;
    }

    public sangill(long cars, long humans, long totalcars, long totalhumans) {
        this.cars = cars;
        this.humans = humans;
        this.totalcars = totalcars;
        this.totalhumans = totalhumans;
    }


}
