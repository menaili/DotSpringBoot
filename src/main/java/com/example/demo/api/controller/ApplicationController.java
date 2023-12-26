package com.example.demo.api.controller;

import java.util.List;


import com.example.demo.Repository.ApplicationRepository;
import com.example.demo.api.model.Application;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/applications")
public class ApplicationController {
    private final ApplicationRepository applicationRepository;

    public ApplicationController(ApplicationRepository applicationRepository){
        this.applicationRepository = applicationRepository;
    }

    @GetMapping()
    public List<Application> getApplications(){
        return applicationRepository.findAll();
    }

    @PostMapping
    public Application addApplication(@RequestBody Application application) {
            System.out.println("Received application: " + application);

            return applicationRepository.save(application);
    }


    @GetMapping("/{id}")
    public Application getApplicationById(@PathVariable int id) {
        return applicationRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Application updateApplication(@PathVariable int id, @RequestBody Application updateApplication) {
        if (applicationRepository.existsById(id)) {
            updateApplication.setId(id);
            return applicationRepository.save(updateApplication);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteApplication(@PathVariable int id) {
        applicationRepository.deleteById(id);
    }
}
