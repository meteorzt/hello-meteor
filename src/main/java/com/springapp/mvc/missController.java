package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jimubox on 2017/7/6.
 */
@Controller
@RequestMapping("/")
public class missController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String printMiss (ModelMap model){
        model.addAttribute("message", "I miss you !");
        return "miss";
    }
}
