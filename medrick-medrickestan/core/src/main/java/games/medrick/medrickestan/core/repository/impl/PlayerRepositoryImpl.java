package games.medrick.medrickestan.core.repository.impl;

import games.medrick.medrickestan.core.entity.Admin;
import games.medrick.medrickestan.core.entity.Player;
import games.medrick.medrickestan.core.repository.extend.PlayerRepositoryExtend;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

/**
 * Created by rasoul on 2/19/2018.
 */
public class PlayerRepositoryImpl implements PlayerRepositoryExtend {

    @PersistenceContext
    EntityManager entityManager;


    public Player findByUdid(String udid) {

        return null;
    }

    @Override
    public Player findByUsername(String username, String password) {
        TypedQuery<Admin> query = entityManager.createQuery(
                "select a from Admin a "
                        + " where a.username = :username and a.password= :password "
                , Admin.class).
                setParameter("username", username)
                .setParameter("password", password)
                ;
        Optional<Admin> admin = query.getResultList().stream().findFirst();

        if (admin.isPresent())
            return admin.get().getPlayer();

        return null;
    }


}
