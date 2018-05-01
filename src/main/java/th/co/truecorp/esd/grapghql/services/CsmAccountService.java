package th.co.truecorp.esd.grapghql.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.co.truecorp.esd.grapghql.repositories.CsmAccountRepository;

@Service
public class CsmAccountService {
    @Autowired
    CsmAccountRepository csmAccountRepository;
}
