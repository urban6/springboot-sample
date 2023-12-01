package com.example.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class IndexController {

    @GetMapping("")
    public HashMap<String, Object> index() {
        HashMap<String, Object> data = new HashMap<>();
        data.put("code", 0);
        data.put("message", "success");
        return data;
    }
}
