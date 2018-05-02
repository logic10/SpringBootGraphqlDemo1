package th.co.truecorp.esd.grapghql.repositories;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import th.co.truecorp.esd.grapghql.models.Customer;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>, JpaSpecificationExecutor<Customer> {
    List<Customer> findAll();

    List<Customer> findByCustomerId(int customerid);

    List<Customer> findByCustomerTypeAndL9Identification(String customerType,String l9Identification);

    List<Customer> findByOperatorId(int operatorid);

    List<Customer> findByl9Identification(String identification);

    // Customer save(Customer item);
    // void delete(Long id);

}
