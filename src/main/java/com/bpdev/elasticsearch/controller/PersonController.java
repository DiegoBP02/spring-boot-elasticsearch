package com.bpdev.elasticsearch.controller;

import com.bpdev.elasticsearch.document.Person;
import com.bpdev.elasticsearch.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/person")
public class PersonController {
    @Autowired
    private PersonService service;

    @PostMapping
    public void save(@RequestBody final Person person){
        service.save(person);
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable final String id){
        return service.findById(id);
    }
}
