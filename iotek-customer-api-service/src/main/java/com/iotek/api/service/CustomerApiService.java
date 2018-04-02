package com.iotek.api.service;

import com.iotek.api.dto.Customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by xiaohuang on 2018/3/31.
 * ----------------The heart withered--------
 */
@RequestMapping("/refactor")
public interface CustomerApiService {
    @GetMapping(value = "/find/{id}")
    Customer findById(@PathVariable(value = "id" ,required = false) Long id);
 /*  @GetMapping(value = "/findAll")
    List<Customer> findAll(@RequestParam Object... parms);*/
    @PostMapping(value = "/login")
    Customer findByName(@ModelAttribute Customer customer);

}
