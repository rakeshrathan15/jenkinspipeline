package com.neoteric.entityclasses;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Project",schema = "sonar")

public class ProjectEntity {

    @Id
    @Column(name = "id")
    private  int id;

    @Column(name = "pname")
    private  String projectname;

    @Column(name = "startdate")
    private Date startDate;

    @Column(name = "enddate")
    private  Date endDate;


@OneToMany(mappedBy = "projectEntity",cascade = CascadeType.ALL,fetch =FetchType.LAZY )
    private List<EmployeeEntity> employeeEntity;

    public ProjectEntity(){
        //Default constructor required by jpa
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<EmployeeEntity> getEmployeeEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(List<EmployeeEntity> employeeEntity) {
        this.employeeEntity = employeeEntity;
    }

    @Override
    public String toString() {
        return "ProjectEntity{" +
                "id=" + id +
                ", projectname='" + projectname + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", employeeEntity=" + employeeEntity +
                '}';
    }
}
