package th.co.truecorp.esd.grapghql.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import th.co.truecorp.esd.grapghql.services.CsmPayChannelService;

@Controller
@RequestMapping(RestConstant.CSMPAYCHANNEL_V1)
public class CsmPayChannelController {
    @Autowired
    CsmPayChannelService csmPayChannelService;
}
