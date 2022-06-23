package com.example.java_iii_project.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * simple Education Repository that extends CrudRepository
 *
 * @author Dawson
 */

@Repository
public interface EducationRepository extends CrudRepository <Education, Integer> {

    /*
        If we need specialized queries beyond those included in CrudRepository we can engage here or in the Repository interface
        But we only need CRUD so don't populate this interface
    */
}





