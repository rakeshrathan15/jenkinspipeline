package com.neoteric.jpaonetomanyinserts;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity(name = "ProjectEntityJPA")
@Table(name = "project_jpa",schema = "sonarlatest")

public class ProjectEntityJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  int id;

    @Column(name = "pname")
    private  String projectname;

    @Column(name = "startdate")
    private Date startDate;

    @Column(name = "enddate")
    private  Date endDate;


@OneToMany(mappedBy = "projectEntity",cascade = CascadeType.ALL,fetch =FetchType.LAZY )
    private List<EmployeeEntityJPA> employeeEntity;

    public ProjectEntityJPA(){
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

    public List<EmployeeEntityJPA> getEmployeeEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(List<EmployeeEntityJPA> employeeEntity) {
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
