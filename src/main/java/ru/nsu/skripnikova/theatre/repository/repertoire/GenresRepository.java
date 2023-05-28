package ru.nsu.skripnikova.theatre.repository.repertoire;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.repertoire.Genres;

@Repository
public interface GenresRepository extends JpaRepository<Genres, Integer> {

    Genres getGenresByGenreId (Integer genreId);

    @Query(value = "SELECT SEQUENCE_GENRES.nextval FROM dual", nativeQuery = true)
    Integer getNextGenresId();
}
