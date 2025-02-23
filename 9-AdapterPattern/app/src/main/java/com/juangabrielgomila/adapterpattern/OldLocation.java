package com.juangabrielgomila.adapterpattern;

/**
 * Created by JuanGabriel on 8/10/17.
 */

public interface OldLocation {

    String getBuilding();
    void setBuilding(String building);

    int getFloor();
    void setFloor(int floor);

    String getOffice();
    void setOffice(String office);

    int getDesk();
    void setDesk(int desk);
}
