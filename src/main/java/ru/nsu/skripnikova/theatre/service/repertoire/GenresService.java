package ru.nsu.skripnikova.theatre.service.repertoire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.controller.requests.GenresRequest;
import ru.nsu.skripnikova.theatre.entity.repertoire.Genres;
import ru.nsu.skripnikova.theatre.repository.repertoire.GenresRepository;

@Service
public class GenresService {

    @Autowired
    private GenresRepository genresRepository;

    public void addGenres (GenresRequest genresRequest) {
        Integer nextVal = genresRepository.getNextGenresId();
        Genres genres = new Genres(nextVal, genresRequest.getGenre());
        genresRepository.save(genres);
    }

    public void deleteGenres (Integer genresId) {
        Genres genres = genresRepository.getGenresByGenreId(genresId);
        if (genres == null) {
            //throw not found exception
        }
        genresRepository.delete(genres);
    }

    public Genres getGenres (Integer genresId) {
        return genresRepository.getGenresByGenreId(genresId);
    }

    public void updateGenres (Genres genres, Integer genresId) {
        if (genresRepository.getGenresByGenreId(genresId) == null) {
            //throw not found exception
        }
        genres.setGenreId(genresId);
        genresRepository.save(genres);
    }
}
