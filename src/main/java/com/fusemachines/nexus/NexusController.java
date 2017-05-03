package com.fusemachines.nexus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nexus")
public class NexusController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Nexus!";
    }

}