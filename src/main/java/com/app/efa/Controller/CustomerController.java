package com.app.efa.Controller;

import com.app.efa.Entity.Customer;
import com.app.efa.Model.CustomerModel;
import com.app.efa.ServiceImp.CustomerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {
    // administrator service
    private CustomerServiceImp customerServiceImp;
    @Autowired
    public CustomerController(CustomerServiceImp customerServiceImp)
    {
        this.customerServiceImp = customerServiceImp;
    }
    //get all customers
    @RequestMapping("/api/customers")
    public List<CustomerModel> getAllCustomers()
    {
        return customerServiceImp.all_customer();
    }
    //get a single customer by id
    @RequestMapping("/api/customer")
    public CustomerModel getAdmin(long id)
    {
        return customerServiceImp.get_customer(id);
    }
    //add customer to database
    @RequestMapping("/api/addCustomer")
    public String addCustomer(CustomerModel customerModel)
    {
        customerServiceImp.add_customer(customerModel);
        return "customer added";
    }
}
