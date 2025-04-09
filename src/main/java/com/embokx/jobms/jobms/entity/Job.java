package com.embokx.jobms.jobms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long job_id;
    private String Job_title;
    private String Job_description;
    private double job_min_salary;
    private double job_max_salary;
    private String job_location;
    private Long company_id;

    public Long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Long company_id) {
        this.company_id = company_id;
    }

    public Long getJob_id() {
        return job_id;
    }

    public void setJob_id(Long job_id) {
        this.job_id = job_id;
    }

    public String getJob_title() {
        return Job_title;
    }

    public void setJob_title(String job_title) {
        Job_title = job_title;
    }

    public String getJob_description() {
        return Job_description;
    }

    public void setJob_description(String job_description) {
        Job_description = job_description;
    }

    public double getJob_min_salary() {
        return job_min_salary;
    }

    public void setJob_min_salary(double job_min_salary) {
        this.job_min_salary = job_min_salary;
    }

    public double getJob_max_salary() {
        return job_max_salary;
    }

    public void setJob_max_salary(double job_max_salary) {
        this.job_max_salary = job_max_salary;
    }

    public String getJob_location() {
        return job_location;
    }

    public void setJob_location(String job_location) {
        this.job_location = job_location;
    }
}
