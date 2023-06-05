package com.juangabrielgomila.adapterpattern;

/**
 * Created by JuanGabriel on 8/10/17.
 */

public interface NewLocation {
    String getBuilding();
    void setBuilding(String building);

    int getFloor();
    void setFloor(int floor);

    int getDesk();
    void setDesk(int desk);
}
