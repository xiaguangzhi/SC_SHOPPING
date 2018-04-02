package iotek.feign.consumer.controller;


import com.iotek.api.dto.Customer;
import iotek.feign.consumer.service.CustomerService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created by xiaohuang on 2018/3/31.
 * ----------------The heart withered--------
 */
@RestController
public class ConsumerController {
    @Autowired
    CustomerService customerService;
    @ResponseBody
    @GetMapping(value = "/hello-consumer/{id}")
    public Customer getCustomer(@PathVariable(value = "id",required = false) Long id){
     return    customerService.findById(id);

    }



}
