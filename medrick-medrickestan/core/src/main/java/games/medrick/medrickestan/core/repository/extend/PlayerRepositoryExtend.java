package games.medrick.medrickestan.core.repository.extend;


import games.medrick.medrickestan.core.entity.Player;

import java.util.List;

/**
 * Created by rasoul on 2/19/2018.
 */
public interface PlayerRepositoryExtend {

    Player findByUdid(String udid);

    Player findByUsername(String username,String password);

}
