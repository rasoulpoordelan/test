package games.medrick.medrickestan.api.controller;

import games.medrick.medrickestan.api.model.account.LoginModel;
import games.medrick.medrickestan.api.model.account.LoginViaUsername;
import games.medrick.medrickestan.api.model.account.SetNickNameModel;
import games.medrick.medrickestan.api.plugin.annotation.Authorization;
import games.medrick.medrickestan.api.utils.ResponseHelper;
import games.medrick.medrickestan.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by behroozbahrameh on 2/16/18
 **/

@RestController
public class AccountController extends BaseController {

    @Autowired
    AccountService accountService;

    @RequestMapping(method = RequestMethod.POST, value = "/account/login")
    public ResponseEntity login(@RequestBody LoginModel model) {
        return ResponseHelper.response(accountService.loginViaUdid(
                model.getUdid()
                , model.getClientVersion()
                , model.getMarket()));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/account/loginviausername")
    public ResponseEntity loginViaUserName(@RequestBody LoginViaUsername model) {
        return ResponseHelper.response(accountService.loginViaUserName(model.getUserName(), model.getPassword()
                , model.getClientVersion()
                , model.getMarket()));
    }

    @Authorization
    @RequestMapping(method = RequestMethod.POST, value = "account/nickname")
    public ResponseEntity setNickName(@RequestBody SetNickNameModel model) {
        return ResponseHelper.response(accountService.setNickName(super.getPlayerId(), model.getNickName()));
    }
}
