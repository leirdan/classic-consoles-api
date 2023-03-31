package com.ufrn.classicconsoles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsoleController {

    @Autowired
    private ConsoleRepository repository;

    @GetMapping("/consoles")
    public List<Console> getConsoles() {
        List<Console> consoles = repository.findAll();
        return consoles;
    }
}
