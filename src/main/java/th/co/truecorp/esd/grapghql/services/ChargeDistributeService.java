package th.co.truecorp.esd.grapghql.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.co.truecorp.esd.grapghql.models.ChargeDistribute;
import th.co.truecorp.esd.grapghql.repositories.ChargeDistributeRepository;

import java.util.List;

@Service
public class ChargeDistributeService {
    @Autowired
    ChargeDistributeRepository chargeDistributeRepository;

    public List<ChargeDistribute> findAll() {
        return (List<ChargeDistribute>) chargeDistributeRepository.findAll();
    }

    public ChargeDistribute findByTrxId(Long trxId) {
        return chargeDistributeRepository.findOne(trxId);
    }
}
