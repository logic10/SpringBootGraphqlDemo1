package th.co.truecorp.esd.grapghql.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.co.truecorp.esd.grapghql.repositories.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
}
