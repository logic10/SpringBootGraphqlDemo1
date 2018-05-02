package th.co.truecorp.esd.grapghql.resolver;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import th.co.truecorp.esd.grapghql.models.Customer;
import th.co.truecorp.esd.grapghql.models.filter.CustomerFilter;
import th.co.truecorp.esd.grapghql.repositories.CustomerRepository;

@Component
public class SearchCustomerResolver implements DataFetcher<List<Customer>>{

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private  ObjectMapper objectMapper = null;

	@Override
	public List<Customer> get(DataFetchingEnvironment environment) {
		//LinkedHashMap link = environment.getArgument("filter");
		Object  rawInput = environment.getArgument("filter");
		CustomerFilter customerinput = objectMapper.convertValue(rawInput, CustomerFilter.class);

		if (customerinput != null && customerinput.getCustomerId() != 0) {
			int customer_id = customerinput.getCustomerId();
			return customerRepository.findByCustomerId(customer_id);
		}else if(customerinput != null && customerinput.getOperatorId() != 0) {
			int oper_id = (Integer) customerinput.getOperatorId();
			return customerRepository.findByOperatorId(oper_id);
		}else if(customerinput != null
				&& !customerinput.getCertification().equals("")
				&& !customerinput.getCustomerType().equals("") ) {
			String certification = customerinput.getCertification();
			String customerType = customerinput.getCustomerType();
			return customerRepository.findByCustomerTypeAndL9Identification(customerType,certification);
		} else if( customerinput != null &&  !customerinput.getPrimResourceVal().equals("")) {
			String primResourceVal = customerinput.getPrimResourceVal();
			List<Customer> custList = new ArrayList<Customer>();
			List<Subscriber> subList = subscriberRepository.findByPrimResourceVal(primResourceVal);

			for(int sub = 0 ; sub < subList.size() ;sub++) {
				int cus_id  = subList.get(sub).getCustomer().getCustomerId();
				custList.addAll(customerRepository.findByCustomerId(cus_id));
			}
			return custList;
		}else if(customerinput != null && !customerinput.getBan().equals("")) {
			String banNo = customerinput.getBan();
			List<Customer> custList = new ArrayList<Customer>();
			List<CsmAccount> csmBans = csmAccountRepository.findCsmAccountByBan(banNo);

			for (int ban = 0; ban < csmBans.size(); ban++) {
				int cus_id = csmBans.get(ban).getCustomer().getCustomerId();
				custList.addAll(customerRepository.findByCustomerId(cus_id));
			}

		}else {
			//return customerRepository.fin
			return null;
		}
	}

}
