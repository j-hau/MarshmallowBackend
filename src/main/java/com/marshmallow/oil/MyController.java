package com.marshmallow.oil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/home")
public class MyController {

    @RequestMapping(value = "cleaner", method = RequestMethod.POST)
    public Cleaning cleaner(@RequestBody OilMapping data){
        Cleaning result = new Cleaning();
        result.setFinalPosition(new int[] {5,5});
        result.setNumOfCleanedPatches(5);
        return result;
    }

    @RequestMapping(value = "robot-cleaner", method = RequestMethod.POST)
    public OilMapping robot_cleaner(@RequestBody OilMapping data){
        OilMapping oilMap = new OilMapping();
        oilMap.setStartingPosition(data.getStartingPosition());
        oilMap.setNavigationInstructions(data.getNavigationInstructions());
        oilMap.setAreaSize(data.getAreaSize());
        oilMap.setOilPatches(data.getOilPatches());
        return oilMap;
    }

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

    @RequestMapping("/thisDir")
    public String thisDir(){
        return "thisDir.html";
    }

    @RequestMapping("/sayHello")
    @GetMapping
    /**
     * {"aa":"bb","foo":"bar","key":"value"}
     * is the output of this, it is in rough json format, if can figure out
     * how to write into a file then it will be a json.
     *
     * When you search localhost:8080/sayHello, it returns that onto the screen
     */
    public Map<String, String> sayHello() {
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("foo", "bar");
        map.put("aa", "bb");
        return map;
    }


}
