package com.hiretalent.rest.HireTalentRest.domain;

import jdk.nashorn.internal.objects.annotations.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Table(name="Requisitions")
@Entity
public class Requisition {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int requisitionId;
    private String projectName;
    private String roleDesignation;
    private String experienceRange;
    private String mustHaveSkill1;
    private String mustHaveSkill2;
    private String goodToHaveSkill1;
    private String goodToHaveSkill2;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "requisition_id", referencedColumnName = "requisitionId")
    private List<Candidate> candidate;

    @Override
    public String toString() {
        return "Requisition{" +
                "requisitionId=" + requisitionId +
                ", projectName='" + projectName + '\'' +
                ", roleDesignation='" + roleDesignation + '\'' +
                ", experienceRange='" + experienceRange + '\'' +
                ", mustHaveSkill1='" + mustHaveSkill1 + '\'' +
                ", mustHaveSkill2='" + mustHaveSkill2 + '\'' +
                ", goodToHaveSkill1='" + goodToHaveSkill1 + '\'' +
                ", goodToHaveSkill2='" + goodToHaveSkill2 + '\'' +
                '}';
    }

    public int getRequisitionId() {
        return requisitionId;
    }

    public void setRequisitionId(int requisitionId) {
        this.requisitionId = requisitionId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getRoleDesignation() {
        return roleDesignation;
    }

    public void setRoleDesignation(String roleDesignation) {
        this.roleDesignation = roleDesignation;
    }

    public String getExperienceRange() {
        return experienceRange;
    }

    public void setExperienceRange(String experienceRange) {
        this.experienceRange = experienceRange;
    }

    public String getMustHaveSkill1() {
        return mustHaveSkill1;
    }

    public void setMustHaveSkill1(String mustHaveSkill1) {
        this.mustHaveSkill1 = mustHaveSkill1;
    }

    public String getMustHaveSkill2() {
        return mustHaveSkill2;
    }

    public void setMustHaveSkill2(String mustHaveSkill2) {
        this.mustHaveSkill2 = mustHaveSkill2;
    }

    public String getGoodToHaveSkill1() {
        return goodToHaveSkill1;
    }

    public void setGoodToHaveSkill1(String goodToHaveSkill1) {
        this.goodToHaveSkill1 = goodToHaveSkill1;
    }

    public String getGoodToHaveSkill2() {
        return goodToHaveSkill2;
    }

    public void setGoodToHaveSkill2(String goodToHaveSkill2) {
        this.goodToHaveSkill2 = goodToHaveSkill2;
    }

    public List<Candidate> getCandidate() {
        return candidate;
    }

    public void setCandidate(List<Candidate> candidate) {
        this.candidate = candidate;
    }

    public Requisition(int requisitionId, String projectName, String roleDesignation, String experienceRange, String mustHaveSkill1, String mustHaveSkill2, String goodToHaveSkill1, String goodToHaveSkill2, List<Candidate> candidate) {
        this.requisitionId = requisitionId;
        this.projectName = projectName;
        this.roleDesignation = roleDesignation;
        this.experienceRange = experienceRange;
        this.mustHaveSkill1 = mustHaveSkill1;
        this.mustHaveSkill2 = mustHaveSkill2;
        this.goodToHaveSkill1 = goodToHaveSkill1;
        this.goodToHaveSkill2 = goodToHaveSkill2;
        this.candidate = candidate;
    }

    public Requisition() {
    }
}
