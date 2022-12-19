package com.example.demo.services;


import org.springframework.stereotype.Service;

import com.example.demo.domain.entities.Branch;
import com.example.demo.domain.repositories.BranchRepository;

@Service
public class BranchService {

    private final BranchRepository branchRepository;

    public BranchService(BranchRepository branchRepository) {

        this.branchRepository = branchRepository;
    }

    public Branch getBranch(Integer id) {
        return branchRepository.findBranchById(id);
    }
}
