package com.sanbercode.lessonOne;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LessonOneController {
    @GetMapping("/")
    public String helloWorld() {
        return "Hello, World";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello!!";
    }

    @GetMapping("/world")
    public String world() {
        return "World!!";
    }
}
