package th.co.truecorp.esd.grapghql.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.co.truecorp.esd.grapghql.models.CsmPayChannel;
import th.co.truecorp.esd.grapghql.repositories.CsmPayChannelRepository;

@Service
public class CsmPayChannelService {
    @Autowired
    CsmPayChannelRepository csmPayChannelRepository;

    public CsmPayChannel save(CsmPayChannel smPayChannel) {
        return csmPayChannelRepository.save(smPayChannel);
    }

    public CsmPayChannel findByPymChannelNo(String pymChannelNo) {
        return csmPayChannelRepository.findOne(pymChannelNo);
    }

    public Iterable<CsmPayChannel> findAll(CsmPayChannel csmPayChannel) {
        return csmPayChannelRepository.findAll();
    }
}
