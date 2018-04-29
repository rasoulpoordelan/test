package games.medrick.medrickestan.core.repository;

import games.medrick.medrickestan.core.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * created by behroozbahrameh on 2/16/18
 **/

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

}
