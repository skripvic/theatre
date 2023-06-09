package ru.nsu.skripnikova.theatre.repository.repertoire;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.repertoire.Authors;

import java.util.List;
import java.util.Set;

@Repository
public interface AuthorsRepository extends JpaRepository<Authors, Integer> {

    Authors getAuthorsByAuthorId (Integer authorId);

    @Query(value = "SELECT SEQUENCE_AUTHORS.nextval FROM dual", nativeQuery = true)
    Integer getNextAuthorsId();

    @Query(value = "SELECT a.country FROM authors a", nativeQuery = true)
    Set<String> getAllCountries();


    @Query(value = "SELECT * " +
            "FROM authors a \n" +
            "JOIN plays p ON a.author_id = p.author_id \n" +
            "WHERE (( ?1 < 0) OR p.genre_id = ?1 ) \n" +
            "AND (( ?2 < 0) OR (SELECT TO_CHAR(a.date_of_birth, 'CC') from DUAL) = ?2 \n" +
            "OR (SELECT TO_CHAR(a.date_of_death, 'CC') from DUAL) = ?2 ) \n" +
            "AND ((?3 IS NULL) OR a.country = ?3 ) " , nativeQuery = true)
    Set<Authors> getAuthorsByFields(Integer genreId, Integer century, String country);

    List<Authors> findAll();
}
