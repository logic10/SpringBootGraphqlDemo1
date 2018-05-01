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
import th.co.truecorp.esd.grapghql.models.ChargeDistribute;
import th.co.truecorp.esd.grapghql.services.ChargeDistributeService;

import java.util.List;

@Controller
@RequestMapping(RestConstant.CHARGEDISTRIBUTE_V1)
public class ChargeDistributeController {
    @Autowired
    ChargeDistributeService chargeDistributeService;

    @RequestMapping(
            value = "/",
            method = {RequestMethod.POST,RequestMethod.GET},
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<ChargeDistribute>> chargeDistribute(@RequestBody ChargeDistribute req) {
        List<ChargeDistribute> chargeDistributeResponse = chargeDistributeService.findAll();
        return new ResponseEntity<>(chargeDistributeResponse, HttpStatus.CREATED);
    }

    @RequestMapping(
            value = "/{trxId}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<ChargeDistribute> chargeDistribute(@PathVariable long trxId) {
        ChargeDistribute chargeDistributeResponse = chargeDistributeService.findByTrxId(trxId);
        return new ResponseEntity<>(chargeDistributeResponse, HttpStatus.CREATED);
    }
}
