package com.cloudVista.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.cloudVista.service.InstanceService;

@Controller
public class InstanceController {

    @Autowired
    private InstanceService instanceService;

    @GetMapping("/instances")
    public String showInstances(Model model) {
        model.addAttribute("instances", instanceService.getAllInstances());
        return "instances";
    }
}
