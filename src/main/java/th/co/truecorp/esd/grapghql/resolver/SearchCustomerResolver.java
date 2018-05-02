package th.co.truecorp.esd.grapghql.resolver;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import th.co.truecorp.esd.grapghql.models.CsmAccount;
import th.co.truecorp.esd.grapghql.models.Customer;
import th.co.truecorp.esd.grapghql.models.Subscriber;
import th.co.truecorp.esd.grapghql.models.filter.CustomerFilter;
import th.co.truecorp.esd.grapghql.repositories.CsmAccountRepository;
import th.co.truecorp.esd.grapghql.repositories.CustomerRepository;
import th.co.truecorp.esd.grapghql.repositories.SubscriberRepository;

@Component
public class SearchCustomerResolver implements DataFetcher<List<Customer>> {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ObjectMapper objectMapper = null;

    @Autowired
    SubscriberRepository subscriberRepository;

    @Autowired
    CsmAccountRepository csmAccountRepository;

    @Override
    public List<Customer> get(DataFetchingEnvironment environment) {
        //LinkedHashMap link = environment.getArgument("filter");
        Object rawInput = environment.getArgument("filter");

        CustomerFilter customerinput = objectMapper.convertValue(rawInput, CustomerFilter.class);

        System.out.println("certification-------->"+ customerinput.getCertification());
        if (customerinput != null && customerinput.getCustomerId() != 0) {
            System.out.print("getCustomerId:");
            int customer_id = customerinput.getCustomerId();
            return customerRepository.findByCustomerId(customer_id);
        } else if (customerinput != null && customerinput.getOperatorId() != 0) {
            System.out.print("getOperatorId:");
            int oper_id = (Integer) customerinput.getOperatorId();
            return customerRepository.findByOperatorId(oper_id);
        } else if (customerinput != null
                && !validateNull(customerinput.getCertification()).equals("")
                && !validateNull(customerinput.getCustomerType()).equals("")) {
            System.out.print("getCertification getCustomerType :");
            String certification = customerinput.getCertification();
            String customerType = customerinput.getCustomerType();
            return customerRepository.findByCustomerTypeAndL9Identification(customerType, certification);
        } else if (customerinput != null && !validateNull(customerinput.getPrimResourceVal()).equals("")) {
            System.out.print("getPrimResourceVal:");
            String primResourceVal = customerinput.getPrimResourceVal();
            List<Customer> custList = new ArrayList<Customer>();
            List<Subscriber> subList = subscriberRepository.findByPrimResourceVal(primResourceVal);

            for (int sub = 0; sub < subList.size(); sub++) {
                int cus_id = subList.get(sub).getCustomer().getCustomerId();
                custList.addAll(customerRepository.findByCustomerId(cus_id));
            }
            return custList;
        } else if (customerinput != null
                && !validateNull(customerinput.getCertification()).equals("")) {
            System.out.println("getCertification:");
            String certification = customerinput.getCertification();

            System.out.print("certification:"+ certification);
            return customerRepository.findByl9Identification(certification);
        } else if (customerinput != null && !validateNull(customerinput.getBan()).equals("")) {
            System.out.print("getBan:");
            String banNo = customerinput.getBan();
            List<Customer> custList = new ArrayList<Customer>();
            List<CsmAccount> csmBans = csmAccountRepository.findByBan(banNo);

            for (int ban = 0; ban < csmBans.size(); ban++) {
                int cus_id = csmBans.get(ban).getCustomer().getCustomerId();
                custList.addAll(customerRepository.findByCustomerId(cus_id));
            }
            return custList;
        }
        System.out.print("null value:");
        return null;

    }


    public static String validateNull(String input)
    {
        return (input == null) ? "" : (String) input;
    }



}
