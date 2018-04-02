package com.iotek.provider.service.impl;



import com.iotek.api.dto.Customer;
import com.iotek.provider.dao.CustomerDao;


import com.iotek.provider.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by xiaohuang on 2018/3/7.
 * ----------------The heart withered--------
 */
@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override

    public Customer queryCustomerByName(Customer customer) {
        if (customer == null) {
            return   null;
        }

        return customerDao.findCustomerByName(customer);
    }

    @Override

    public boolean addCustomer(Customer customer) {
        if (customer == null) {
            return  false;
        }
            return    customerDao.addCustomer(customer);
    }

    @Override
    public boolean deleteCustomer(Customer customer) {
        return false;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return false;
    }

    @Override
    public List<Customer> queryAllCustomer() {
        return null;
    }

    @Override
    public Customer findCustomerByid(int cid) {
        return customerDao.findCustomerByid(cid);
    }

    @Override
    public Customer findCustomerByEmail(String customerName, int id) {
        return null;
    }

    @Override
    public List<Customer> findLikeName(String name) {
        return null;
    }

    @Override
    public List<Customer> findCustomerList(List<Customer> customerList) {
        return null;
    }
}
