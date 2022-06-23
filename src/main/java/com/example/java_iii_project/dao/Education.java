package com.example.java_iii_project.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Optional;

/**
 * Simple class to represent a education. This class
 * represents a single diploma, certificate or degree. Students
 * may have many of these.
 *
 * Education has the following attributes:
 *  - ID - for DB purposes, primary key
 *  - Title - program title. ie. "Accelerated Software Development"
 *  - Institution - name of institution, university, college or school
 *  - Grad Year - year of the class. ie. "Class of 2022"
 *  - Start Date - when the program started
 *  - End Date - when the program ended
 *  - Abbreviation - how the degree is denoted. ie. "ASD"
 *
 *  Future considerations - Degree type?
 *
 * @author Dawson
 */
@Entity(name = "education")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;

    private String institutionName;
    private Integer gradYear;

    @JsonFormat(pattern="yyyy-MM-dd")  //yyyy-MM-dd
    private LocalDate startDate;

    @JsonFormat(pattern="yyyy-MM-dd")  //yyyy-MM-dd
    private LocalDate endDate;

    private String abbreviation;

    /**
     * get ID
     * @return id
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
     * get title
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * set title
     * @param title title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * get institution name
     * @return institution name
     */
    public String getInstitutionName() {
        return institutionName;
    }

    /**
     * set institution name
     * @param institutionName institution name
     */
    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    /**
     * get grad year
     * @return gradYear
     */
    public Integer getGradYear() {
        return gradYear;
    }

    /**
     * set grad year
     * @param gradYear gradYear
     */
    public void setGradYear(Integer gradYear) {
        this.gradYear = gradYear;
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
     * get Abbreviation
     * @return abbreviation
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * set Abbreviation
     * @param abbreviation abbreviation
     */
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
