package com.jrcdsf.myCV.entities;

public class WorkHistory {
    private String employer;
    private String address;
    private String country;
    private String startDate;
    private String endDate;
    private String description;
    private String role;

    public WorkHistory(String employer, String address, String country, String startDate, String endDate, String description, String role) {
        this.employer = employer;
        this.address = address;
        this.country = country;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.role = role;
    }

    public WorkHistory() {
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "WorkHistory{" +
                "employer='" + employer + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", description='" + description + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
