package ru.nsu.skripnikova.theatre.service.people_info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.controller.requests.BodyBuildRequest;
import ru.nsu.skripnikova.theatre.entity.people_info.BodyBuild;
import ru.nsu.skripnikova.theatre.repository.people_info.BodyBuildRepository;

@Service
public class BodyBuildService {

    @Autowired
    private BodyBuildRepository bodyBuildRepository;

    public void addBodyBuild (BodyBuildRequest bodyBuildRequest) {
        Integer nextVal = bodyBuildRepository.getNextBodyBuildId();
        BodyBuild bodyBuild = new BodyBuild(nextVal, bodyBuildRequest.getBodyBuild(), bodyBuildRequest.getDescription());
        bodyBuildRepository.save(bodyBuild);
    }

    public void deleteBodyBuild (Integer bodyBuildId) {
        BodyBuild bodyBuild = bodyBuildRepository.getBodyBuildByBodyBuild(bodyBuildId);
        if (bodyBuild == null) {
            //throw not found exception
        }
        bodyBuildRepository.delete(bodyBuild);
    }

    public BodyBuild getBodyBuild (Integer bodyBuildId) {
        return bodyBuildRepository.getBodyBuildByBodyBuild(bodyBuildId);
    }

    public void updateBodyBuild (BodyBuild bodyBuild, Integer bodyBuildId) {
        if (bodyBuildRepository.getBodyBuildByBodyBuild(bodyBuildId) == null) {
            //throw not found exception
        }
        bodyBuild.setBodyBuildId(bodyBuildId);
        bodyBuildRepository.save(bodyBuild);
    }
}
