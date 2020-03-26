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

    public int[] navigation(){
        /**
         * This sets a pair of mutable and temporary coordinates that will be altered during the switch statement
         * It also sets up direction which is an array of characters belonging to the navigation instructions
         */
        int X = this.startingPosition[0];
        int Y = this.startingPosition[1];
        char[] direction = this.navigationInstructions.toCharArray();

        for (char iter : direction){
            //switch statement for direction

            switch (iter){
                /**With North and South equivalent to Y coordinates and East and West equivalent to X coordinates
                 * areaSize[0] is equivalent to East/West coordinate and areaSize[1] is North/South coordinate.
                 * Once the move has been validated, it binds the new value to the variable name and breaks out of switch.
                **/
                case 'N':
                    //Simple validation check to see if moving up 1 square would put the position out of range
                    if ((Y + 1) < this.areaSize[1]){
                        Y = new Integer(Y+1);
                        //System.out.println("In North");
                        break;
                    }
                case 'E':
                    if ((X+1) <= this.areaSize[0]){
                        X = new Integer(X+1);
                        //System.out.println("In East");
                        break;
                    }
                case 'S':
                    if((Y-1) >= 0){
                        Y = new Integer(Y-1);
                        //System.out.println("In South");
                        break;
                    }
                case 'W':
                    if((X-1) >= 0){
                        X = new Integer(X-1);
                        //System.out.println("In West");
                        break;
                    }

            }
            /**After validating the move and moving the current set of coordinates are legal coordinates.
             * It then updates the position of the robot to the new set of coordinates.
             * After that it checks to see if the new coordinates lies ontop of an oil patch.
             */
            setStartingPosition(new int[]{X,Y});
            oilPatch();
        }
        return new int[]{X,Y};
    }

    /**
     * Simple function that iterates though the oil patch and checks if the current position is on an oil
     * It iterates through every element in oilPatches.  If the current position matches that of an oil patch,
     * the function returns true and the oil patch has its coordinates changed to {-1,-1} to stop it being read twice.
     * @return a Boolean variable that indicates if it is on an oil patch.
     */
    public Boolean isOilPatch(){
        //Loop through all oil patches
        Boolean foo = false;
        int counter = 0;
        for (int[] pos : this.oilPatches){
            //If it is currently on an oil patch then change flag variable to true
            if(this.startingPosition[0] == pos[0] && this.startingPosition[1] == pos[1]){
                foo = true;
                //Changing the values in the oilPatches array to -1 so they cannot be read again.  -1 is a flag.
                this.oilPatches[counter][0] = -1;
                this.oilPatches[counter][1] = -1;
                break;
            }
            counter++;
        }
        return foo;
    }

    /**
     * Simply checking if the current patch is an oil patch and incrementing the patches cleaned counter.
     */
    public void oilPatch(){
        if(isOilPatch()){
            this.patchesCleaned++;
        }
    }

    public int getPatchesCleaned(){
        return patchesCleaned;
    }

    public void setPatchesCleaned(int patchesCleaned) {
        this.patchesCleaned = patchesCleaned;
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
