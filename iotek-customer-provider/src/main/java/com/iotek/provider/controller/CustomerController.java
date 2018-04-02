package com.iotek.provider.controller;

import com.iotek.api.dto.Customer;
import com.iotek.api.service.CustomerApiService;
import com.iotek.provider.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created by xiaohuang on 2018/3/31.
 * ----------------The heart withered--------
 */
@RestController
public class CustomerController implements CustomerApiService{

    @Autowired
    CustomerService customerService;


    @Override
    public Customer findById(@PathVariable(value = "id",required = false) Long id) {

        return customerService.findCustomerByid(Math.toIntExact(id));
    }
/*
    @Override
    public List<Customer> findAll(@RequestParam Object... parms) {
        return null;
    }*/
    @ResponseBody
    @Override
    public Customer findByName(@ModelAttribute Customer customer) {
        return customerService.queryCustomerByName(customer);
    }
}
