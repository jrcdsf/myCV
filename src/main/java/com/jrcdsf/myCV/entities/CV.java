package com.jrcdsf.myCV.entities;

import java.util.Set;

public class CV {

    private String fullName;
    private String name;
    private String surname;
    private int age;
    private String email;
    private String mobile;
    private String address;
    private String birthday;
    private Set<WorkHistory> workHistory;
    private Set<Education> educationHistory;
    private Set<Skill> skills;
    private Set<Language> languages;
    private String profileImgPath;
    private String about;

    public CV(String fullName, String name, String surname, int age, String email, String mobile, String address, String birthday, Set<WorkHistory> workHistory, Set<Education> educationHistory, Set<Skill> skills, Set<Language> languages, String profileImgPath, String about) {
        this.fullName = fullName;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
        this.birthday = birthday;
        this.workHistory = workHistory;
        this.educationHistory = educationHistory;
        this.skills = skills;
        this.languages = languages;
        this.profileImgPath = profileImgPath;
        this.about = about;
    }

    public CV() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Set<WorkHistory> getWorkHistory() {
        return workHistory;
    }

    public void setWorkHistory(Set<WorkHistory> workHistory) {
        this.workHistory = workHistory;
    }

    public Set<Education> getEducationHistory() {
        return educationHistory;
    }

    public void setEducationHistory(Set<Education> educationHistory) {
        this.educationHistory = educationHistory;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    public Set<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<Language> languages) {
        this.languages = languages;
    }

    public String getProfileImgPath() {
        return profileImgPath;
    }

    public void setProfileImgPath(String profileImgPath) {
        this.profileImgPath = profileImgPath;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public String toString() {
        return "CV{" +
                "fullName='" + fullName + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                ", birthday='" + birthday + '\'' +
                ", workHistory=" + workHistory +
                ", educationHistory=" + educationHistory +
                ", skills=" + skills +
                ", languages=" + languages +
                ", profileImgPath='" + profileImgPath + '\'' +
                ", about='" + about + '\'' +
                '}';
    }
}
