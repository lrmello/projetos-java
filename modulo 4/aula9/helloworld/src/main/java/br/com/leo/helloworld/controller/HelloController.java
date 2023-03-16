package br.com.leo.helloworld.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private List<String> names = new ArrayList<>(List.of());
    @GetMapping
    public String sayHelloWorld(){
        return Arrays.toString(names.toArray());
    }

    @PostMapping
    public String sayHello(
            @RequestParam String name

    ){
        names.add(name);
        return "Name added";
    }

    @DeleteMapping()
    public String deleteName(@RequestParam int id){
        String response;

        try{
            response = "Success: "+ names.remove(id) + "has been removed";
        }catch (IndexOutOfBoundsExpection e){
            response = "Cannot remove name with id";
        }
        return response;
    }
}
