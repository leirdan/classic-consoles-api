package com.ufrn.classicconsoles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsoleController {
    @GetMapping(value = "/home")
    public String index() {
        return "hi, world!";
    }
}
