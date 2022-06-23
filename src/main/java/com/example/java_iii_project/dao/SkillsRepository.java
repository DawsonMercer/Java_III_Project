package com.example.java_iii_project.dao;

import org.springframework.data.repository.CrudRepository;

public interface SkillsRepository extends CrudRepository<Skills, Integer> {
    /* If we need specialized queries beyond those included in the CrudRepository we can
     engage here or in the repository interfaces.
     But we only need CRUD so don't populate this interface
    */


}