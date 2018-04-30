package th.co.truecorp.esd.grapghql.resolver;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import th.co.truecorp.esd.grapghql.models.ChargeDistribute;
import th.co.truecorp.esd.grapghql.repositories.ChargeDistributeRepository;
import th.co.truecorp.esd.grapghql.repositories.CustomerRepository;

@Component
public class SearchCustomerInfo implements DataFetcher<List<ChargeDistribute>>{

	@Autowired
    private CustomerRepository CustomerRepository;
	
	@Override
	public List<ChargeDistribute> get(DataFetchingEnvironment environment) {
		String id = environment.getArgument("id");
		return null;
	}

}
