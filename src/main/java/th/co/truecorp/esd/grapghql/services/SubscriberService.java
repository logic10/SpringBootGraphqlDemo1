package th.co.truecorp.esd.grapghql.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.co.truecorp.esd.grapghql.repositories.SubscriberRepository;

@Service
public class SubscriberService {
    @Autowired
    SubscriberRepository subscriberRepository;
}
