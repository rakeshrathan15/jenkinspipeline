package com.neoteric.insertjdbc;

import com.neoteric.entityclasses.ProjectEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "employee_latest",schema = "sonarlatest")

public class EmployeeEntity {

    public EmployeeEntity(){
        //Default constructor
    }

    @Id
    @Column(name = "id")
  private int id;

  @Column(name = "name")
  private  String name;

  @Column(name = "dept")
 private String dept;

  @Column(name = "salary")
 private  double salary;

    @Column(name = "state")
    private String  state;


@ManyToOne
@JoinColumn(name = "pid",referencedColumnName = "id")
private ProjectEntity projectEntity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ProjectEntity getProjectEntity() {
        return projectEntity;
    }

    public void setProjectEntity(ProjectEntity projectEntity) {
        this.projectEntity = projectEntity;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", state='" + state + '\'' +
                '}';
    }
}
