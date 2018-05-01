package th.co.truecorp.esd.grapghql.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import th.co.truecorp.esd.grapghql.services.SubscriberService;

@Controller
@RequestMapping(RestConstant.SUBSCRIBER_V1)
public class SubscriberController {
    @Autowired
    SubscriberService service;
}
