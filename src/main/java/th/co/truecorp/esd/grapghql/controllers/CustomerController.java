package th.co.truecorp.esd.grapghql.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import th.co.truecorp.esd.grapghql.models.Customer;
import th.co.truecorp.esd.grapghql.services.CustomerService;

@Controller
@RequestMapping(RestConstant.CUSTOMER_V1)
public class CustomerController {
	
	@Autowired
    private CustomerService customerService;

    @RequestMapping(
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Customer> save(@RequestBody Customer req) {
        return new ResponseEntity<>(customerService.save(req), HttpStatus.CREATED);
    }

    @RequestMapping(
            value = "/",
            method = {RequestMethod.POST},
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Iterable<Customer>> findAll(@RequestBody Customer req) {
        Iterable<Customer> chargeDistributeResponse = customerService.findAll(req);
        return new ResponseEntity<>(chargeDistributeResponse, HttpStatus.CREATED);
    }

    @RequestMapping(
            value = "/{customerId}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Customer> findByCustomerId(@PathVariable Integer customerId) {
        Customer chargeDistributeResponse = customerService.findByCustomerId(customerId);
        return new ResponseEntity<>(chargeDistributeResponse, HttpStatus.CREATED);
    }
}
