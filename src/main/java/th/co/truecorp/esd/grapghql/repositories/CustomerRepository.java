package th.co.truecorp.esd.grapghql.repositories;


import th.co.truecorp.esd.grapghql.models.Customer;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>  {
	    //Customer findOne(Long id);
	    //List<Customer> findAll();
	    List<Customer> findByCustomerId(int customerid);
	    List<Customer> findByOperatorId(int operatorid);
	    //Customer save(Customer item);
	    //void delete(Long id);
	    
}
