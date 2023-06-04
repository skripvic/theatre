package ru.nsu.skripnikova.theatre.repository.people;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.people.Actors;

import java.util.List;

@Repository
public interface ActorsRepository extends JpaRepository<Actors, Integer> {

    Actors getActorsByActorId(Integer actorId);

    @Query(value = "SELECT * FROM actors", nativeQuery = true)
    List<Actors> getActors ();

    @Query(value = "SELECT *\n" +
            "FROM employees e\n" +
            "JOIN actors a ON a.actor_id = e.employee_id\n" +
            "ORDER BY employee_id", nativeQuery = true)
    List<Actors> getActorsAndEmployees();

    @Query(value = "SELECT *\n" +
            "FROM employees e\n" +
            "JOIN actors a ON a.actor_id = e.employee_id\n" +
            "JOIN roles r ON r.sex = e.sex\n" +
            "WHERE r.role_id = ?1\n" +
            "   AND a.body_build_id = r.body_build_id\n" +
            "   AND (a.height >= r.min_height OR r.min_height IS NULL)\n" +
            "   AND (a.height <= r.max_height OR r.max_height IS NULL)\n" +
            "   AND (trunc(months_between(sysdate, birth_date) / 12) >= r.min_age OR r.min_age IS NULL)\n" +
            "   AND (trunc(months_between(sysdate, birth_date) / 12) <= r.max_age OR r.max_age IS NULL)\n" +
            "   AND (r.voice_id IS NULL OR r.voice_id = a.voice_id);\n", nativeQuery = true)
    List<Actors> getActorsByRoleId(Integer roleId);


    @Query(value = "SELECT e.first_name, e.last_name\n" +
            "    FROM actors a\n" +
            "    JOIN actor_title at ON a.actor_id = at.actor_id\n" +
            "    JOIN titles t ON at.title_id = t.title_id\n" +
            "    JOIN employees e ON a.actor_id = e.employee_id\n" +
            "    WHERE title_id = ?1 \n" +
            "    AND   e.sex = ?2 \n" +
            "    AND   (trunc(months_between(sysdate, birth_date) / 12) >= ?3 OR ?3 IS NULL)\n" +
            "    AND   (trunc(months_between(sysdate, birth_date) / 12) <= ?4 OR ?4 IS NULL)\n"
            , nativeQuery = true)
    List<Actors> getActorsByTitleId(Integer titleId, String sex, Integer minAge, Integer maxAge);



}
