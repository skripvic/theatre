package ru.nsu.skripnikova.theatre.service.repertoire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.controller.requests.FormForAuthorsRequest;
import ru.nsu.skripnikova.theatre.controller.requests.FormForRolesByFields;
import ru.nsu.skripnikova.theatre.controller.requests.RolesRequest;
import ru.nsu.skripnikova.theatre.entity.repertoire.Authors;
import ru.nsu.skripnikova.theatre.entity.repertoire.Roles;
import ru.nsu.skripnikova.theatre.repository.repertoire.RolesRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class RolesService {

    @Autowired
    private RolesRepository rolesRepository;

    public void addRoles (RolesRequest rolesRequest) {
        Integer nextVal = rolesRepository.getNextRolesId();
        Roles roles = new Roles(nextVal, rolesRequest.getRoleName(), rolesRequest.getVoiceId(), rolesRequest.getPlayId(),
                rolesRequest.getSex(), rolesRequest.getBodyBuildId(), rolesRequest.getMinHeight(), rolesRequest.getMaxHeight(),
                rolesRequest.getMinAge(), rolesRequest.getMaxAge());
        rolesRepository.save(roles);
    }

    public void deleteRoles (Integer rolesId) {
        Roles roles = rolesRepository.getRolesByRoleId(rolesId);
        if (roles == null) {
            //throw not found exception
        }
        rolesRepository.delete(roles);
    }

    public Roles getRoles (Integer rolesId) {
        return rolesRepository.getRolesByRoleId(rolesId);
    }

    public void updateRoles (Roles roles, Integer rolesId) {
        if (rolesRepository.getRolesByRoleId(rolesId) == null) {
            //throw not found exception
        }
        roles.setRoleId(rolesId);
        rolesRepository.save(roles);
    }

    public List<Roles> getRolesByFields(FormForRolesByFields formForRolesByFields) {
        Integer actorId = formForRolesByFields.getActorId();
        Integer directorId = formForRolesByFields.getDirectorId();
        Integer genreId = formForRolesByFields.getGenreId();
        Integer ageCategoryId = formForRolesByFields.getAgeCategoryId();
        String fromDate = formForRolesByFields.getFromDate();
        String toDate = formForRolesByFields.getToDate();
        if (formForRolesByFields.getActorId() == null){
            actorId = -1;
        }
        if (formForRolesByFields.getDirectorId() == null){
            directorId = -1;
        }
        if (formForRolesByFields.getGenreId() == null){
            genreId = -1;
        }
        if (formForRolesByFields.getAgeCategoryId() == null){
            ageCategoryId = -1;
        }
        return new ArrayList<>(rolesRepository.getRolesByFields(actorId, directorId, genreId,
                ageCategoryId, fromDate, toDate));
    }
}
