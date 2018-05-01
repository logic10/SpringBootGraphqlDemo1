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
import th.co.truecorp.esd.grapghql.models.CsmPayChannel;
import th.co.truecorp.esd.grapghql.services.CsmPayChannelService;

@Controller
@RequestMapping(RestConstant.CSMPAYCHANNEL_V1)
public class CsmPayChannelController {
    @Autowired
    CsmPayChannelService csmPayChannelService;

    @RequestMapping(
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<CsmPayChannel> save(@RequestBody CsmPayChannel req) {
        return new ResponseEntity<>(csmPayChannelService.save(req), HttpStatus.CREATED);
    }

    @RequestMapping(
            value = "/",
            method = {RequestMethod.POST},
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Iterable<CsmPayChannel>> findAll(@RequestBody CsmPayChannel req) {
        Iterable<CsmPayChannel> chargeDistributeResponse = csmPayChannelService.findAll(req);
        return new ResponseEntity<>(chargeDistributeResponse, HttpStatus.CREATED);
    }

    @RequestMapping(
            value = "/{pymChannelNo}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<CsmPayChannel> findByPymChannelNo(@PathVariable String pymChannelNo) {
        CsmPayChannel chargeDistributeResponse = csmPayChannelService.findByPymChannelNo(pymChannelNo);
        return new ResponseEntity<>(chargeDistributeResponse, HttpStatus.CREATED);
    }
}
