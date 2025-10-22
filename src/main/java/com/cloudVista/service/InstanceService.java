package com.cloudVista.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudVista.model.Instance;
import com.cloudVista.repository.InstanceRepository;

import java.util.List;

@Service
public class InstanceService {

    @Autowired
    private InstanceRepository instanceRepository;

    public List<Instance> getAllInstances() {
        return instanceRepository.findAll();
    }

    public void addMockInstances() {
        if (instanceRepository.count() == 0) {
            instanceRepository.save(new Instance("i-12345", 45, 60, 40, "running"));
            instanceRepository.save(new Instance("i-67890", 72, 80, 50, "running"));
            instanceRepository.save(new Instance("i-54321", 10, 30, 20, "stopped"));
        }
    }
}
