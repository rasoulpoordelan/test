package games.medrick.medrickestan.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * created by Behrooz Bahrame on 2/17/2018
 **/

@RestController
public class BaseController {

    @Autowired
    private HttpServletRequest request;
    private long playerId;

    public long getPlayerId() {
        try {
            this.playerId = (long) request.getSession().getAttribute("playerId");
        } catch (Exception ex) {
            this.playerId = -1;
        }
        return playerId;
    }

}
