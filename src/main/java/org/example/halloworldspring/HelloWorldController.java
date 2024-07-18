package org.example.halloworldspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloWorldController {

    @GetMapping
    public String helloWorld(){
        System.out.println(" HelloWorld");
        return "Hello World!";
    }
    @GetMapping("/{name}")
    public String hello(@PathVariable String name){
        System.out.println(" Hello " + name);
        return "Hello " + name;
    }
}
