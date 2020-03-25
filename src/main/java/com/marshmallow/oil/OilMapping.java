package com.marshmallow.oil;

import java.io.Serializable;

/**
 * Class for the JSON file which mirrors the format for Jackson to port data into.
 * Declared variables with appropriate types.
 * Get and Set methods included.
 */
public class OilMapping implements Serializable {

    private String navigationInstructions;
    private int[] areaSize;
    private int[] startingPosition;
    private int[][] oilPatches;
    private int patchesCleaned = 0;
    private int[] currentPosition = startingPosition;

    public int[] navigation(){
        //iterating over each character in the navigation instructions
        char[] direction = this.navigationInstructions.toCharArray();
        for (char iter : direction){
            //switch statement for direction
            //switch (iter){
             //   case "N":

            //}
        }
        return new int[]{1};
    }

    /**
     * Simple function that iterates though the oil patch and checks if the current position is on an oil patch
     * @return a Boolean variable that indicates if it is on an oil patch.
     */
    public boolean isOilPatch(){
        //Trying to disprove that it the current position is on an oil patch
        Boolean foo = false;
        //Loop through all oil patches
        for (int[] pos : this.oilPatches){
            //If it is currently on an oil patch then change flag variable to true
            if(this.currentPosition[0] == pos[0] && this.currentPosition[1] == pos[1]){
                foo = true;
            }
        }
        //return flag variable
        return foo;
    }

    public int getPatchesCleaned(){
        return patchesCleaned;
    }

    public void setPatchesCleaned(int patchesCleaned) {
        this.patchesCleaned = patchesCleaned;
    }

    public int[] getCurrentPosition(){
        return this.currentPosition;
    }

    public void setCurrentPosition(int[] currentPosition) {
        this.currentPosition = currentPosition;
    }

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
