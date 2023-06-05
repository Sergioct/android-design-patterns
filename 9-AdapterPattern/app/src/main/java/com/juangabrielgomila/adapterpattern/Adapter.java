package com.juangabrielgomila.adapterpattern;

/**
 * Created by JuanGabriel on 8/10/17.
 */

public class Adapter implements NewLocation {

    final OldLocation oldLocation;

    String building;
    int floor;
    int desk;


    public Adapter(OldLocation oldLocation){
        this.oldLocation = oldLocation;
        setBuilding(oldLocation.getBuilding());
        setFloor(oldLocation.getFloor());
        setDesk(oldLocation.getDesk());
    }


    @Override
    public String getBuilding() {
        return building;
    }

    @Override
    public void setBuilding(String building) {
        this.building = building;
    }

    @Override
    public int getFloor() {
        return floor;
    }

    @Override
    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public int getDesk() {
        return desk;
    }

    @Override
    public void setDesk(int desk) {
        this.desk = desk;
    }
}
