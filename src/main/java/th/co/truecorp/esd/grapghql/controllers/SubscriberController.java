package th.co.truecorp.esd.grapghql.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import th.co.truecorp.esd.grapghql.models.Subscriber;
import th.co.truecorp.esd.grapghql.services.SubscriberService;

@Controller
@RequestMapping(RestConstant.SUBSCRIBER_V1)
public class SubscriberController {
    @Autowired
    SubscriberService subscriberService;

    @RequestMapping(
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Subscriber> save(@RequestBody Subscriber req) {
        return new ResponseEntity<>(subscriberService.save(req), HttpStatus.CREATED);
    }

    @RequestMapping(
            value = "/",
            method = {RequestMethod.POST},
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Iterable<Subscriber>> findAll(@RequestBody Subscriber req) {
        Iterable<Subscriber> chargeDistributeResponse = subscriberService.findAll(req);
        return new ResponseEntity<>(chargeDistributeResponse, HttpStatus.CREATED);
    }

    @RequestMapping(
            value = "/{subscriberNo}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Subscriber> findByTrxId(@PathVariable Integer subscriberNo) {
        Subscriber chargeDistributeResponse = subscriberService.findBySubscriberNo(subscriberNo);
        return new ResponseEntity<>(chargeDistributeResponse, HttpStatus.CREATED);
    }
}
