package com.neoteric.dockerlearning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    int i= 10;

    @GetMapping("/dockerDemo")
    public String getHelloWorld() {
        return "Docker Demo with jenkins and docker" +
                "Hello   Rakesh ";
    }
}