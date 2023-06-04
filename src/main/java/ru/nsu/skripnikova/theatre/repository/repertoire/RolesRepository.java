package ru.nsu.skripnikova.theatre.repository.repertoire;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.repertoire.Roles;

import java.util.List;
import java.util.Set;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {

    Roles getRolesByRoleId (Integer roleId);

    @Query(value = "SELECT SEQUENCE_ROLES.nextval FROM dual", nativeQuery = true)
    Integer getNextRolesId();

    @Query(value = "SELECT DISTINCT * \n" +
            "    FROM roles r\n" +
            "    JOIN castings c ON c.role_id = r.role_id\n" +
            "    JOIN plays p ON p.play_id = r.play_id\n" +
            "    JOIN stagings s ON c.staging_id = s.staging_id\n" +
            "    JOIN show_dates sd ON sd.staging_id = s.staging_id\n" +
            "    WHERE ((?1 < 0) OR c.actor_id = ?1 OR c.backup_actor_id = ?1)\n" +
            "    AND ((?2 < 0) OR director_id = ?2)\n" +
            "    AND ((?3 < 0) OR p.genre_id = ?3)\n" +
            "    AND ((?4 < 0) OR age_category_id = ?4)\n" +
            "    AND ((?5 IS NULL) OR sd.show_date >= TO_DATE(?5, 'yyyy.mm.dd')) " +
            "    AND ((?6 IS NULL) OR sd.show_date <= TO_DATE(?6, 'yyyy.mm.dd')) \n", nativeQuery = true)
    Set<Roles> getRolesByFields(Integer actorId, Integer directorId, Integer genreId,
                                Integer ageCategoryId, String fromDate, String toDate);

}
