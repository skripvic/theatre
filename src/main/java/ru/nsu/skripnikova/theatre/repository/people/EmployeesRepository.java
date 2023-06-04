package ru.nsu.skripnikova.theatre.repository.people;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.people.Actors;
import ru.nsu.skripnikova.theatre.entity.people.Employees;
import ru.nsu.skripnikova.theatre.entity.repertoire.Roles;

import java.util.Date;
import java.util.List;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Integer> {

    Employees getEmployeesByEmployeeId (Integer employeeId);

    @Query(value = "SELECT * FROM employees \n" +
            "ORDER BY employee_id", nativeQuery = true)
    List<Employees> getAllEmployees();


    @Query(value = "SELECT SEQUENCE_EMPLOYEES.nextval FROM dual", nativeQuery = true)
    Integer getNextEmployeesId();

//    @Query(value = "SELECT employee_id,\n" +
//                "first_name,\n" +
//                "last_number,\n" +
//                "sex,\n" +
//                "birth_date,\n" +
//                "number_of_children,\n" +
//                "salary\n" +
//                "FROM employees\n" +
//                "ORDER BY employee_id;", nativeQuery = true)
//    List<Employees> getEmployeesQ1();

    @Query(value = "SELECT trunc(months_between(sysdate, birth_date) / 12) as age " +
            "FROM employees " +
            "ORDER BY employee_id", nativeQuery = true)
    List<Integer> getEmployeesAgesQ1();

    @Query(value = "SELECT *\n" +
            "FROM employees\n" +
            "WHERE position_id = ?1\n" +
            "ORDER BY employee_id", nativeQuery = true)
    List<Employees> getEmployeesByPositionId (Integer positionId);

    @Query(value = "SELECT COUNT(*)\n" +
            "FROM employees\n" +
            "WHERE position_id = ?1\n", nativeQuery = true)
    Integer getEmployeesCountByPositionId(Integer positionId);

    @Query(value = "SELECT COUNT(*)\n" +
            "FROM employees\n" , nativeQuery = true)
    Integer getEmployeesCount();

    @Query(value = "SELECT * \n" +
            "    FROM employees e \n" +
            "    JOIN actors a ON a.actor_id = e.employee_id \n" +
            "    JOIN roles r ON r.sex = e.sex \n" +
            "    WHERE r.role_id = ?1 \n" +
            "    AND ((?3 = 0) OR ((?3 = 1) AND (a.body_build_id = r.body_build_id OR r.body_build_id IS NULL))) \n" +
            "    AND ((?4 = 0) OR ((?4 = 1) AND (a.height >= r.min_height OR r.min_height IS NULL))) \n" +
            "    AND ((?5 = 0) OR ((?5 = 1) AND (a.height <= r.max_height OR r.max_height IS NULL))) \n" +
            "    AND ((?6 = 0) OR ((?6 = 1) AND ((trunc(months_between(sysdate, birth_date) / 12) >= r.min_age OR r.min_age IS NULL)))) \n" +
            "    AND ((?7 = 0) OR ((?7 = 1) AND ((trunc(months_between(sysdate, birth_date) / 12) <= r.max_age OR r.max_age IS NULL)))) \n" +
            "    AND ((?2 = 0) OR ((?2 = 1) AND (r.voice_id IS NULL OR r.voice_id = a.voice_id))) ", nativeQuery = true)
    List<Employees> getActorsByRoleId(Integer roleId, Integer isVoiceCorrect, Integer isBodyBuildCorrect,
                                      Integer isMinHeightCorrect, Integer isMaxHeightCorrect, Integer isMinAgeCorrect, Integer isMaxAgeCorrect);

    @Query(value = "SELECT * \n" +
            "    FROM employees e\n" +
            "    JOIN tours t ON t.employee_id = e.employee_id\n" +
            "    WHERE ((?1 = 1 AND home_theatre = 'Дом') OR (?1 = 0 AND host_theatre = 'Дом'))\n" +
            "    AND ((?2 IS NULL) OR t.start_date >= TO_DATE(?2, 'yyyy.mm.dd')) " +
            "    AND ((?3 IS NULL) OR t.start_date <= TO_DATE(?3, 'yyyy.mm.dd'))", nativeQuery = true)
    List<Employees> getEmployeesByTour(Integer isFromHome, String fromDate, String toDate);


    @Query(value = "SELECT * \n" +
            "    FROM employees e\n" +
            "    JOIN stagings s ON e.employee_id = s.director_id \n" +
            "    JOIN plays p ON p.play_id = s.play_id \n" +
            "    JOIN show_dates sd ON s.staging_id = sd.staging_id  \n" +
            "    WHERE s.staging_id = ?1 \n", nativeQuery = true)
    Employees getDirectorByStagingId(Integer stagingId);

    @Query(value = "SELECT * \n" +
            "    FROM employees e\n" +
            "    JOIN stagings s ON e.employee_id = s.art_director_id \n" +
            "    JOIN plays p ON p.play_id = s.play_id \n" +
            "    JOIN show_dates sd ON s.staging_id = sd.staging_id  \n" +
            "    WHERE s.staging_id = ?1 \n", nativeQuery = true)
    Employees getArtDirectorByStagingId(Integer stagingId);

    @Query(value = "SELECT * \n" +
            "    FROM employees e\n" +
            "    JOIN stagings s ON e.employee_id = s.conductor_id \n" +
            "    JOIN plays p ON p.play_id = s.play_id \n" +
            "    JOIN show_dates sd ON s.staging_id = sd.staging_id  \n" +
            "    WHERE s.staging_id = ?1 \n", nativeQuery = true)
    Employees getConductorByStagingId(Integer stagingId);

    @Query(value = "SELECT * \n" +
            "    FROM employees e\n" +
            "    JOIN castings c ON c.actor_id = e.employee_id\n" +
            "    JOIN stagings s ON s.staging_id = c.staging_id \n" +
            "    WHERE s.staging_id = ?1 \n", nativeQuery = true)
    List<Employees> getActorsByStagingId(Integer stagingId);

    @Query(value = "SELECT * \n" +
            "    FROM employees e\n" +
            "    JOIN castings c ON c.backup_actor_id = e.employee_id\n" +
            "    JOIN stagings s ON s.staging_id = c.staging_id \n" +
            "    WHERE s.staging_id = ?1 \n", nativeQuery = true)
    List<Employees> getBackupActorsByStagingId(Integer stagingId);


    Employees getEmployeesByFirstNameAndLastNameAndBirthDate(String firstName, String lastName, Date birthDate);

}
