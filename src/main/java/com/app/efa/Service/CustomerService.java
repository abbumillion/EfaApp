package com.app.efa.Service;

import com.app.efa.Entity.Admin;
import com.app.efa.Entity.Customer;
import com.app.efa.Entity.Feedback;
import com.app.efa.Model.CustomerModel;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    void add_customer(CustomerModel customerModel);
    CustomerModel get_customer(long id);
    List<CustomerModel> all_customer();
    void update_customer(long id);
    void delete_customer(long id);
    void delete_all();
}
