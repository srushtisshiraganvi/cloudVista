package com.cloudVista.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Instance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String instanceId;
    private int cpuUsage;
    private int memoryUsage;
    private int diskUsage;
    private String status;

    public Instance() {}

    public Instance(String instanceId, int cpuUsage, int memoryUsage, int diskUsage, String status) {
        this.instanceId = instanceId;
        this.cpuUsage = cpuUsage;
        this.memoryUsage = memoryUsage;
        this.diskUsage = diskUsage;
        this.status = status;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public String getInstanceId() { return instanceId; }
    public int getCpuUsage() { return cpuUsage; }
    public int getMemoryUsage() { return memoryUsage; }
    public int getDiskUsage() { return diskUsage; }
    public String getStatus() { return status; }

    public void setId(Long id) { this.id = id; }
    public void setInstanceId(String instanceId) { this.instanceId = instanceId; }
    public void setCpuUsage(int cpuUsage) { this.cpuUsage = cpuUsage; }
    public void setMemoryUsage(int memoryUsage) { this.memoryUsage = memoryUsage; }
    public void setDiskUsage(int diskUsage) { this.diskUsage = diskUsage; }
    public void setStatus(String status) { this.status = status; }
}
