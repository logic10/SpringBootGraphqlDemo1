package th.co.truecorp.esd.grapghql.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.co.truecorp.esd.grapghql.models.Customer;
import th.co.truecorp.esd.grapghql.repositories.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer findByCustomerId(Integer customerId) {
        return customerRepository.findOne(customerId);
    }

    public Iterable<Customer> findAll(Customer customer) {
        return customerRepository.findAll();
    }
}
