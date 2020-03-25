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
        return result;
    }


    @RequestMapping(value = "robot-cleaner", method = RequestMethod.POST)
    public OilMapping robot_cleaner(@RequestBody OilMapping data){
        OilMapping oilMap = new OilMapping();
        return data;
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
