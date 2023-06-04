package ru.nsu.skripnikova.theatre.service.repertoire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.controller.requests.AuthorsRequest;
import ru.nsu.skripnikova.theatre.controller.requests.FormForAuthorsRequest;
import ru.nsu.skripnikova.theatre.entity.repertoire.Authors;
import ru.nsu.skripnikova.theatre.entity.repertoire.Genres;
import ru.nsu.skripnikova.theatre.repository.repertoire.AuthorsRepository;
import ru.nsu.skripnikova.theatre.repository.repertoire.GenresRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
public class AuthorsService {

    @Autowired
    private AuthorsRepository authorsRepository;

    @Autowired
    private GenresService genresService;

    public List<Authors> getAllAuthors(){
        return authorsRepository.findAll();
    }

    public List<String> getAllCountries(){
        return new ArrayList<>(authorsRepository.getAllCountries());
    }

    public List<Genres> getAllGenres(){
        return genresService.getAllGenres();
    }
    public void addAuthors(AuthorsRequest authorsRequest) throws ParseException {
        Integer nextVal = authorsRepository.getNextAuthorsId();
        Date birthDate = formatDateFromString(authorsRequest.getDateOfBirth());
        Date deathDate = formatDateFromString(authorsRequest.getDateOfDeath());
        Authors authors = new Authors(nextVal, authorsRequest.getFullName(), birthDate, deathDate, authorsRequest.getCountry());
        authorsRepository.save(authors);
    }

    public void deleteAuthors(Integer authorId) {
        Authors authors = authorsRepository.getAuthorsByAuthorId(authorId);
        if (authors == null) {
            //throw not found exception
        }
        authorsRepository.delete(authors);
    }

    public Authors getAuthors(Integer authorId) {
        return authorsRepository.getAuthorsByAuthorId(authorId);
    }

    public void updateAuthors(Authors authors, Integer authorId) {
        if (authorsRepository.getAuthorsByAuthorId(authorId) == null) {
            //throw not found exception
        }
        authors.setAuthorId(authorId);
        authorsRepository.save(authors);
    }

    private Date formatDateFromString(String stringDate) throws  ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
        return formatter.parse(stringDate);
    }

    public List<Authors> getAuthorsByFields(FormForAuthorsRequest formForAuthorsRequest) {
        Integer genreId = formForAuthorsRequest.getGenreId();
        Integer century = formForAuthorsRequest.getCentury();
        String country = formForAuthorsRequest.getCountry();
        if (formForAuthorsRequest.getGenreId() == null){
            genreId = -1;
        }
        if (formForAuthorsRequest.getCentury() == null){
            century = -1;
        }
        if (Objects.equals(formForAuthorsRequest.getCountry(), "-1")){
            country = null;
        }
        return new ArrayList<>(authorsRepository.getAuthorsByFields(genreId, century, country));
    }

}
