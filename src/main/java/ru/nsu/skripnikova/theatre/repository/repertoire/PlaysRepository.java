package ru.nsu.skripnikova.theatre.repository.repertoire;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.people.Employees;
import ru.nsu.skripnikova.theatre.entity.repertoire.Plays;

import java.util.List;
import java.util.Set;

@Repository
public interface PlaysRepository extends JpaRepository<Plays, Integer> {

    Plays getPlaysByPlayId (Integer playId);

    @Query(value = "SELECT SEQUENCE_PLAYS.nextval FROM dual", nativeQuery = true)
    Integer getNextPlaysId();

    @Query(value = "SELECT * FROM plays", nativeQuery = true)
    List<Plays> getAllPlays();

    @Query(value = "SELECT * \n" +
            "FROM plays p\n" +
            "JOIN stagings s ON p.play_id = s.play_id \n" +
            "JOIN show_dates sd ON s.staging_id = sd.staging_id \n" +
            "JOIN authors a ON a.author_id = p.author_id\n" +
            "WHERE ((?1 = 0)" +
            "OR    ((?1 = 1) AND sd.show_date > (SELECT season_start  FROM seasons WHERE sysdate >= season_start and sysdate <= season_finish)\n" +
            "AND   sd.show_date < (SELECT season_finish FROM seasons WHERE sysdate >= season_start and sysdate <= season_finish)))\n" +
            "AND   ((?2 = 0) OR (?2 = 1 AND sd.show_date < sysdate)) \n" +
            "AND   ((?3 < 0) OR p.genre_id = ?3) \n" +
            "AND   ((?4 IS NULL) OR sd.show_date >= TO_DATE(?4, 'yyyy.mm.dd')) " +
            "AND   ((?5 IS NULL) OR sd.show_date <= TO_DATE(?5, 'yyyy.mm.dd')) \n" +
            "AND   ((?6 < 0) OR trunc(p.year_of_creation / 100)+1 = ?6) \n" +
            "AND   ((?7 < 0) OR a.author_id = ?7) \n" +
            "ORDER BY p.play_id", nativeQuery = true)
    Set<Plays> getPlaysByFieldsStaged(Integer thisSeason, Integer alreadyShown, Integer genreId, String fromDate,
                                      String toDate, Integer centuryOfCreation, Integer authorId);

    @Query(value = "SELECT * \n" +
            "FROM plays p\n" +
            "JOIN authors a ON a.author_id = p.author_id\n" +
            "WHERE ((?1 < 0) OR p.genre_id = ?1) \n" +
            "AND   ((?2 < 0) OR trunc(p.year_of_creation / 100)+1 = ?2) \n" +
            "AND   ((?3 < 0) OR a.author_id = ?3) \n" +
            "ORDER BY p.play_id", nativeQuery = true)
    List<Plays> getPlaysByFields(Integer genreId, Integer centuryOfCreation, Integer authorId);


    @Query(value = "SELECT p.name \n" +
            "FROM plays p\n" +
            "JOIN stagings s ON s.play_id = p.play_id \n" +
            "WHERE s.staging_id = ?1\n", nativeQuery = true)
    String getPlayNameByStagingId(Integer stagingId);

}
