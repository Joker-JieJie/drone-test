package com.example.dronetest1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jie Jie
 * @class_name DroneController
 * @since 2021/6/30 17:57
 **/
@RestController
public class DroneController {

    @GetMapping("getStr")
    public String getStr() {
        return "Hello Drone";
    }
}
