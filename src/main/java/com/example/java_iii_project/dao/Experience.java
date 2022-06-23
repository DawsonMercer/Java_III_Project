package com.example.java_iii_project.dao;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;


/**
 * Simple class to represent a Experience. This class
 * represents a single job.
 *
 * Education has the following attributes:
 *  - ID - for DB purposes, primary key
 *  - Start Date - when the program started
 *  - End Date - when the program ended
 *  - JobTitle - job title
 *  - Company - name of the company
 *  - Description - Job roles and description
 *
 * @author Dawson
 */
@Entity
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @JsonFormat(pattern = "yyyy-MM-dd") //yyyy-MM-dd
    private LocalDate startDate;

    @JsonFormat (pattern = "yyyy-MM-dd") //yyyy-MM-dd
    private LocalDate endDate;

    private String jobTitle;
    private String company;
    private String description;

    /**
     * get ID
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set ID
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * getStartDate
     * @return
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * set start date
     * @param startDate startDate
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     * get end date
     * @return endDate
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * set end date
     * @param endDate endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /**
     * get job title
     * @return job title
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * set job title
     * @param jobTitle job title
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * get company
     * @return company
     */
    public String getCompany() {
        return company;
    }

    /**
     * set company
     * @param company company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * set dedscription
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
