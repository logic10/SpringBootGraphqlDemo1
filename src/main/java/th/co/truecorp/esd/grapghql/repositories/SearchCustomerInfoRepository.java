package th.co.truecorp.esd.grapghql.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import th.co.truecorp.esd.grapghql.models.Customer;

@Repository
public interface SearchCustomerInfoRepository extends CrudRepository<Customer, Long>  {
    List<Customer> findAll();
    List<Customer> findByCustomerId(int customerid);
    List<Customer> findByOperatorId(int operatorid);
}
