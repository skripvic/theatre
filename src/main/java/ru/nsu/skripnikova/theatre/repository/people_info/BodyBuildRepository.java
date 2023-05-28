package ru.nsu.skripnikova.theatre.repository.people_info;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.people_info.BodyBuild;

@Repository
public interface BodyBuildRepository extends JpaRepository<BodyBuild, Integer> {

    BodyBuild getBodyBuildByBodyBuild (Integer bodyBuildId);

    @Query(value = "SELECT SEQUENCE_BODY_BUILD.nextval FROM dual", nativeQuery = true)
    Integer getNextBodyBuildId();
}
