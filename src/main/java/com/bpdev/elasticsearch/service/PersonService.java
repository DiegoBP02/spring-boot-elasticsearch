package com.bpdev.elasticsearch.service;

import com.bpdev.elasticsearch.document.Person;
import com.bpdev.elasticsearch.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public void save(final Person person){
        repository.save(person);
    }

    public Person findById(final String id){
        return repository.findById(id).orElse(null);
    }
}
