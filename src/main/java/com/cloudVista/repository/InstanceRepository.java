package com.cloudVista.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloudVista.model.Instance;

@Repository
public interface InstanceRepository extends JpaRepository<Instance, Long> { }
