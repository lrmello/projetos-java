package com.rd.leo.PersonalApp.model;

import lombok.*;

@Getter
@Setter @Builder @AllArgsConstructor @NoArgsConstructor
public class PersonalTrainer {

    private Long id;
    private String name;

    private Integer experienceInYears;
    private String college;
    private String category;

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(Integer experienceInYears) {
        this.experienceInYears = experienceInYears;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
