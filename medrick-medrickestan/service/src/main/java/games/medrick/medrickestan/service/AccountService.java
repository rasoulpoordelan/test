package games.medrick.medrickestan.service;

import games.medrick.medrickestan.core.model.account.PlayerProfile;
import org.springframework.stereotype.Service;

/**
 * created by behroozbahrameh on 2/16/18
 **/


public interface AccountService {
    PlayerProfile loginViaUdid(String udid, int clientVersion, short market);

    PlayerProfile loginViaUserName(String userName, String password, int clientVersion, short market);

    String setNickName(long playerId, String nickName);

    long getPlayeIdFromToken(String token);
}
