package com.example.demo.example1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class example1 {
    public String name="Aruna";
    @GetMapping("/setName")
    public String getName()
    {
    	return "Welcome "+name;
    }
}
