package th.co.truecorp.esd.grapghql.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import th.co.truecorp.esd.grapghql.models.Customer;
import th.co.truecorp.esd.grapghql.repositories.CustomerRepository;

@Component
public class FindByCustomerIdResolver implements DataFetcher<List<Customer>>{

	@Autowired
    private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> get(DataFetchingEnvironment environment) {
		// TODO Auto-generated method stub
		int customer_id = environment.getArgument("customer_id");
		int customer_id2 = environment.getArgument("customer_id2");
		System.out.println("customer_id2 = " + customer_id2);
		
        return customerRepository.findByCustomerid(customer_id);
	}

	
}
