package com.marshmallow.oil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MyController {

    @RequestMapping("/")
    public String index(){
        return "index.html";
    }

    /**
     * you can return any html file as long as it is in the templates folder.
     * @ResponseBody will just make sure that it is displayed on the screen and not just read.
     * @return
     */
    @RequestMapping("/thisDir")
    public String thisDir(){
        return "thisDir.html";
    }

    @RequestMapping("/TestDir")
    @ResponseBody
    public String testDir(){
        return "This is a temporary testing directory";
    }

    @RequestMapping("/sayHello")
    @GetMapping
    @ResponseBody
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
