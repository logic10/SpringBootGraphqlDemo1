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
import th.co.truecorp.esd.grapghql.models.CsmAccount;
import th.co.truecorp.esd.grapghql.services.CsmAccountService;

@Controller
@RequestMapping(RestConstant.CSMACCOUNT_V1)
public class CsmAccountController {
    @Autowired
    CsmAccountService csmAccountService;

    @RequestMapping(
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<CsmAccount> save(@RequestBody CsmAccount req) {
        return new ResponseEntity<>(csmAccountService.save(req), HttpStatus.CREATED);
    }

    @RequestMapping(
            value = "/",
            method = {RequestMethod.POST},
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Iterable<CsmAccount>> findAll(@RequestBody CsmAccount req) {
        Iterable<CsmAccount> chargeDistributeResponse = csmAccountService.findAll(req);
        return new ResponseEntity<>(chargeDistributeResponse, HttpStatus.CREATED);
    }

    @RequestMapping(
            value = "/{ban}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<CsmAccount> findByBan(@PathVariable String ban) {
        CsmAccount chargeDistributeResponse = csmAccountService.findByBan(ban);
        return new ResponseEntity<>(chargeDistributeResponse, HttpStatus.CREATED);
    }
}
