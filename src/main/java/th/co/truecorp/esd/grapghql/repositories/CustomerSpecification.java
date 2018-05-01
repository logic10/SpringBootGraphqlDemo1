package th.co.truecorp.esd.grapghql.repositories;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;
import th.co.truecorp.esd.grapghql.models.Customer;
import th.co.truecorp.esd.grapghql.models.Customer_;

import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

public class CustomerSpecification {
    public static Specification<Customer> searchAll(Customer req) {
        return (root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            if (!StringUtils.isEmpty(req.getCustomerId())) {
                criteriaBuilder.equal(root.get(Customer_.customerId), req.getCustomerId());
            }
            if (!StringUtils.isEmpty(req.getCustomerType())) {
                predicates.add(
                        criteriaBuilder.like(root.get(Customer_.customerType), req.getCustomerType())
                );
            }
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        };
    }
}
