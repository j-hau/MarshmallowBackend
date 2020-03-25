package com.marshmallow.oil;

import java.util.ArrayList;
import java.util.List;

public class OilMapping {

    private String navigationInstructions;
    private List areaSize = new ArrayList();
    private List startingPosition = new ArrayList();
    private List oilPatches = new ArrayList();

    public String getNavigationInstructions(){
        return navigationInstructions;
    }

    public void setNavigationInstructions(String navigationInstructions){
        this.navigationInstructions = navigationInstructions;
    }

    public List getAreaSize(){
        return areaSize;
    }

    public void setAreaSize(List areaSize){
        this.areaSize = areaSize;
    }

    public List getStartingPosition(){
        return startingPosition;
    }

    public void setStartingPosition(List startingPosition){
        this.startingPosition = startingPosition;
    }

    public List getOilPatches(){
        return oilPatches;
    }

    public void setOilPatches(List oilPatches){
        this.oilPatches = oilPatches;
    }

}
