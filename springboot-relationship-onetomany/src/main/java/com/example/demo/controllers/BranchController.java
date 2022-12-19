package com.example.demo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.entities.Branch;
import com.example.demo.services.BranchService;

@RestController
public class BranchController {

    private final BranchService branchService;

    public BranchController(BranchService branchService) {
        this.branchService = branchService;
    }

    @GetMapping(path = "/branches/{id}")
    public Branch getBranch(@PathVariable("id") Integer id) {
        return branchService.getBranch(id);
    }
}
