package com.hiretalent.rest.HireTalentRest.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name="candidates")
@Entity
public class Candidate {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int candidateId;
    private String candidateDesignation;
    private String currentCompany;
    private String relevantExperience;
    @Temporal(TemporalType.TIMESTAMP)
    private Date sourceDate ;
    private String recruiterEmail;
    private String candidateName;
    private String candidateEmail;

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getCandidateDesignation() {
        return candidateDesignation;
    }

    public void setCandidateDesignation(String candidateDesignation) {
        this.candidateDesignation = candidateDesignation;
    }

    public String getCurrentCompany() {
        return currentCompany;
    }

    public void setCurrentCompany(String currentCompany) {
        this.currentCompany = currentCompany;
    }

    public String getRelevantExperience() {
        return relevantExperience;
    }

    public void setRelevantExperience(String relevantExperience) {
        this.relevantExperience = relevantExperience;
    }

    public Date getSourceDate() {
        return sourceDate;
    }

    public void setSourceDate(Date sourceDate) {
        this.sourceDate = sourceDate;
    }

    public String getRecruiterEmail() {
        return recruiterEmail;
    }

    public void setRecruiterEmail(String recruiterEmail) {
        this.recruiterEmail = recruiterEmail;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateEmail() {
        return candidateEmail;
    }

    public void setCandidateEmail(String candidateEmail) {
        this.candidateEmail = candidateEmail;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "candidateId='" + candidateId + '\'' +
                ", candidateDesignation='" + candidateDesignation + '\'' +
                ", currentCompany='" + currentCompany + '\'' +
                ", relevantExperience='" + relevantExperience + '\'' +
                ", sourceDate=" + sourceDate +
                ", recruiterEmail='" + recruiterEmail + '\'' +
                ", candidateName='" + candidateName + '\'' +
                ", candidateEmail='" + candidateEmail + '\'' +
                '}';
    }
}
