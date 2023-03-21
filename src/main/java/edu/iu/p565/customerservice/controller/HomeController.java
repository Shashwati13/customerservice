package edu.iu.p565.customerservice.controller;

import org.springframework.web.bind.annotation.*;;

@RestController
@RequestMapping
public class HomeController {
    


@GetMapping


public String greeting(){

    return "Greetings";
}


}
