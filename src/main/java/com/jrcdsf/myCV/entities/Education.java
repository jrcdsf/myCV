package com.jrcdsf.myCV.entities;

public class Education {
    private String course;
    private String school;
    private String startDate;
    private String endDate;

    public Education(String course, String school, String startDate, String endDate) {
        this.course = course;
        this.school = school;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Education() {
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
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

    @Override
    public String toString() {
        return "Education{" +
                "course='" + course + '\'' +
                ", school='" + school + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
