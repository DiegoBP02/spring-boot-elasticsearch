package com.bpdev.elasticsearch.controller;

import com.bpdev.elasticsearch.document.Person;
import com.bpdev.elasticsearch.document.Vehicle;
import com.bpdev.elasticsearch.search.SearchRequestDTO;
import com.bpdev.elasticsearch.service.PersonService;
import com.bpdev.elasticsearch.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {
    @Autowired
    private VehicleService service;

    @PostMapping
    public void index(@RequestBody final Vehicle vehicle){
        service.index(vehicle);
    }

    @GetMapping("/{id}")
    public Vehicle findById(@PathVariable final String id){
        return service.getById(id);
    }

    @PostMapping("/search")
    public List<Vehicle> search(@RequestBody final SearchRequestDTO dto){
        return service.search(dto);
    }
}
