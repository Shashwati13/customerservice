package edu.iu.p565.customerservice.controller;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import edu.iu.p565.model.Customer;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
    @GetMapping
    public List<Customer> findAll(){
        return null;
    }

    
}