package ru.nsu.skripnikova.theatre.repository.people_info;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.people_info.Titles;

@Repository
public interface TitlesRepository extends JpaRepository<Titles, Integer> {

    Titles getTitlesByTitleID (Integer titlesId);
}
