package th.co.truecorp.esd.grapghql.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.co.truecorp.esd.grapghql.models.Subscriber;
import th.co.truecorp.esd.grapghql.repositories.SubscriberRepository;

@Service
public class SubscriberService {
    @Autowired
    SubscriberRepository subscriberRepository;

    public Subscriber save(Subscriber subscriber) {
        return subscriberRepository.save(subscriber);
    }

    public Subscriber findBySubscriberNo(Integer subscriberNo) {
        return subscriberRepository.findOne(subscriberNo);
    }

    public Iterable<Subscriber> findAll(Subscriber subscriber) {
        return subscriberRepository.findAll();
    }
}
