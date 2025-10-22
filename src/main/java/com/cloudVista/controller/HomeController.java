package com.cloudVista.controller;

import com.cloudVista.model.Instance;
import com.cloudVista.service.InstanceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private final InstanceService instanceService;

    // ✅ Constructor injection for service
    public HomeController(InstanceService instanceService) {
        this.instanceService = instanceService;
    }

    @GetMapping("/")
    public String home(Model model) {
        // ✅ Fetch instances from service layer
        List<Instance> instances = instanceService.getAllInstances();
        model.addAttribute("instances", instances);

        // ✅ Show dashboard.html from templates folder
        return "dashboard";
    }
}
