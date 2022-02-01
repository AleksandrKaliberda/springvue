package main.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("story")
//@CrossOrigin("*")
@CrossOrigin(origins = "http://localhost:8081/")
public class TestController {

    @GetMapping("words")
    public String getStoryWords(){
        return "some word third changes";
    }
}
