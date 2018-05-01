package th.co.truecorp.esd.grapghql.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.co.truecorp.esd.grapghql.models.CsmAccount;
import th.co.truecorp.esd.grapghql.repositories.CsmAccountRepository;

@Service
public class CsmAccountService {
    @Autowired
    CsmAccountRepository csmAccountRepository;

    public CsmAccount save(CsmAccount csmAccount) {
        return csmAccountRepository.save(csmAccount);
    }

    public CsmAccount findByBan(String ban) {
        return csmAccountRepository.findOne(ban);
    }

    public Iterable<CsmAccount> findAll(CsmAccount csmAccount) {
        return csmAccountRepository.findAll();
    }
}
