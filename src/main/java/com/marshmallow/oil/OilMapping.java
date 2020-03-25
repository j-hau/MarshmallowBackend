package com.marshmallow.oil;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OilMapping implements Serializable {

    private String navigationInstructions;
    private int[] areaSize;
    private int[] startingPosition;
    private int[][] oilPatches;

    public String getNavigationInstructions(){
        return navigationInstructions;
    }

    public void setNavigationInstructions(String navigationInstructions){
        this.navigationInstructions = navigationInstructions;
    }

    public int[] getAreaSize(){
        return areaSize;
    }

    public void setAreaSize(int[] areaSize){
        this.areaSize = areaSize;
    }

    public int[] getStartingPosition(){
        return startingPosition;
    }

    public void setStartingPosition(int[] startingPosition){
        this.startingPosition = startingPosition;
    }

    public int[][] getOilPatches(){
        return oilPatches;
    }

    public void setOilPatches(int[][] oilPatches){
        this.oilPatches = oilPatches;
    }

}
