package com.app.efa.ServiceImp;

import com.app.efa.Helpers.EntityToModelConverter;
import com.app.efa.Model.CustomerModel;
import com.app.efa.Repository.CustomerRepo;
import com.app.efa.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {

    private CustomerRepo customerRepo;
    @Autowired
    public CustomerServiceImp(CustomerRepo customerRepo)
    {
        this.customerRepo = customerRepo;
    }

    @Override
    public void add_customer(CustomerModel customerModel) {
       // customerRepo.save(ModelToEntityConverter.);
    }

    @Override
    public CustomerModel get_customer(long id) {
        return EntityToModelConverter.CustomerEntityToCustomerModel(customerRepo.getReferenceById(id));
    }

    @Override
    public List<CustomerModel> all_customer() {

        return null;
    }

    @Override
    public void update_customer(long id) {

    }

    @Override
    public void delete_customer(long id) {
        customerRepo.deleteById(id);
    }

    @Override
    public void delete_all() {
        customerRepo.deleteAll();
    }
}
