package com.marshmallow.oil;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class MyController {

    /**
     * This will be the main function that does the computation.  Of type Cleaning which is in the format that
     * is requested in the documentation.  It takes in the body
     * @param data
     * @return
     */
    @RequestMapping(value = "cleaner", method = RequestMethod.POST)
    public Cleaning cleaner(@RequestBody OilMapping data){
        Cleaning result = new Cleaning();
        result.setFinalPosition(data.navigation());
        result.setNumOfCleanedPatches(data.getPatchesCleaned());
        return result;
    }

    /**
     * Test function
     * @param data is the JSON file that is being retrieved in the body of the POST request
     * @return oilMap is being returned which is a Java object of the JSON file input
     * This allows me to see how the JSON file can be mapped to a Java object
     */
    @RequestMapping(value = "robot-cleaner", method = RequestMethod.POST)
    public OilMapping robot_cleaner(@RequestBody OilMapping data){
        OilMapping oilMap = new OilMapping();
        oilMap.setStartingPosition(data.getStartingPosition());
        oilMap.setNavigationInstructions(data.getNavigationInstructions());
        oilMap.setAreaSize(data.getAreaSize());
        oilMap.setOilPatches(data.getOilPatches());
        return oilMap;
    }

    /**
     * Test function
     * @param data is the JSON file that is being retrieved in the body of the POST request
     * @return oilMap is being returned which is a Java object of the JSON file input
     * This acts as a test function which allows me to play with the values and see what is being returned.
     */
    @RequestMapping(value = "test-cleaner", method = RequestMethod.POST)
    public OilMapping test_cleaner(@RequestBody OilMapping data){
        OilMapping oilMap = new OilMapping();
        oilMap.setStartingPosition(new int[] {10,10});
        oilMap.setNavigationInstructions("TESTING VALUES");
        oilMap.setAreaSize(new int[] {10,10});
        oilMap.setOilPatches(new int[][] {{10,10},{9,9},{8,8},{7,7}});
        return oilMap;
    }

    /**
    @RequestMapping("/robotic-cleaner")
    public OilMapping patchData(@RequestBody OilMapping inputVal){
        return new OilMapping(inputVal);
    }
     **/
}
