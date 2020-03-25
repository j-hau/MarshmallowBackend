package com.marshmallow.oil;

import java.io.Serializable;

public class Cleaning implements Serializable {
    private int[] finalPosition;
    private int numOfCleanedPatches;

    public void setFinalPosition(int[] finalPosition){
        this.finalPosition = finalPosition;
    }

    public int[] getFinalPosition(){
        return finalPosition;
    }

    public void setNumOfCleanedPatches(int numOfCleanedPatches){
        this.numOfCleanedPatches = numOfCleanedPatches;
    }

    public int getNumOfCleanedPatches(){
        return numOfCleanedPatches;
    }


}
