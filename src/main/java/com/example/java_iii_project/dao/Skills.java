package com.example.java_iii_project.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * simple class to represent Skills.
 *
 * Skills have the following attributes:
 * - name- name of the skill
 * - type - type of skill (personal, professtional, etc.)
 */
@Entity
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String type;

    /**
     * get id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * set id
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * set name
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get type
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * set type
     * @param type type
     */
    public void setType(String type) {
        this.type = type;
    }
}