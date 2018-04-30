package th.co.truecorp.esd.grapghql.resolver;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import th.co.truecorp.esd.grapghql.models.CsmAccount;
import th.co.truecorp.esd.grapghql.models.Customer;
import th.co.truecorp.esd.grapghql.models.Subscriber;
import th.co.truecorp.esd.grapghql.repositories.CsmAccountRepository;
import th.co.truecorp.esd.grapghql.repositories.CustomerRepository;
import th.co.truecorp.esd.grapghql.repositories.SubscriberRepository;

@Component
public class SearchCustomerResolver implements DataFetcher<List<Customer>>{
	@Autowired
    private CustomerRepository customerRepository;
	
	@Autowired
    private SubscriberRepository subscriberRepository;
	
	@Autowired
	CsmAccountRepository csmAccountRepository;
	
	@Override
	public List<Customer> get(DataFetchingEnvironment arg0) {
		LinkedHashMap link = arg0.getArgument("filter");
		
		if( link.get("customerId") != null ) {
			int customer_id = (int) link.get("customerId");
			
			return customerRepository.findByCustomerId(customer_id);
		}else if( link.get("operatorId") != null ) {
			int operatorid = (int) link.get("operatorId");
			return customerRepository.findByOperatorId(operatorid);
		}else if( link.get("identification") != null ) {
			String identification = (String) link.get("identification");
			return customerRepository.findByl9Identification(identification);
		}
		else if( link.get("identification") != null && link.get("customerType") != null) {
			String identification = (String) link.get("identification");
			String customerType = (String) link.get("customerType");
			
			
			
			
			return customerRepository.findByl9Identification(identification);
		}else if( link.get("msisdn") != null) {
			String primResourceVal = (String) link.get("msisdn");
			List<Customer> custList = new ArrayList<Customer>();
			List<Subscriber> subList = subscriberRepository.findByPrimResourceVal(primResourceVal);
			
			for(int sub = 0 ; sub < subList.size() ;sub++) {
				int cus_id  = subList.get(sub).getCustomer().getCustomerId();
				custList.addAll(customerRepository.findByCustomerId(cus_id));
			}		
			return custList;
		}else if( link.get("ban") != null) {
			String banNo = (String) link.get("ban");
			List<Customer> custList = new ArrayList<Customer>();
			List<CsmAccount> csmBans = csmAccountRepository.findCsmAccountByBan(banNo);
			
			for(int ban = 0 ; ban < csmBans.size() ;ban++) {
				int cus_id  = csmBans.get(ban).getCustomer().getCustomerId();
				custList.addAll(customerRepository.findByCustomerId(cus_id));
			}	
			
			return custList;
		}

		return null;
		
	}

}
