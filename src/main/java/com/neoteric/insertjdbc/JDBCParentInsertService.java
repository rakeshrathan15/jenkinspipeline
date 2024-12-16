package com.neoteric.insertjdbc;



import java.sql.*;
import java.util.List;

public class JDBCParentInsertService {


    public int getMaxId(String query) {
        int max=0;
        Connection con;
        PreparedStatement psmt;
        ResultSet resultSet;
        try {

        Class.forName("com.mysql.cj.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3307/sonar","root","sonar");
        psmt=con.prepareStatement(query);
        resultSet = psmt.executeQuery();
        if(resultSet!=null && resultSet.next()){
            max=resultSet.getInt(1)+1;
                }else {
            max=1;
        }

        }catch (Exception e){



        }
        return max;
    }

    public void insertEmp(Employee employee){
        Connection con;
        PreparedStatement psmt;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3307/sonar","root","sonar");
            psmt=con.prepareStatement("insert into sonarlatest.employee_latest(eid,name,dept,state,salary,pid)"+"values(?,?,?,?,?,?)");
            psmt.setInt(1,employee.getId());
            psmt.setString(2, employee.getName());
            psmt.setString(3, employee.getDept());
            psmt.setString(4, employee.getState());
            psmt.setDouble(5,employee.getSalary());
            psmt.setInt(6,employee.getPid());

            boolean status = psmt.execute();

            if(status){
                System.out.println("insert sucess ..... ");
            }else {
                System.out.println("insert failed.....");
            }


        }catch (Exception e){



        }
    }


    public void insertProject(Project project){
        Connection con;
        PreparedStatement psmt;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3307/sonar","root","sonar");
            psmt=con.prepareStatement("insert into sonarlatest.project_latest(id,pname,startdate,enddate)"+"values(?,?,?,?)");
            psmt.setInt(1,project.getId());
            psmt.setString(2, project.getProjectname());
            psmt.setDate(3, new Date(project.getStartdate().getTime()));
            psmt.setDate(4,new Date( project.getEnddate().getTime()));



            boolean status = psmt.execute();

            if(status){
                System.out.println("insert  project  is sucessful ..... ");
            }else {
                System.out.println("insert project is failed.....");
            }


        }catch (Exception e){



        }
    }

    public void saveProject(List<Project> projects){
        //iterate project
        for (int i =0; i<projects.size();i++){

            Project project= projects.get(i);
            // getmax pid from i need pass query

            int maxIdofProjectId = getMaxId("select max(id) from sonarlatest.project_latest");

            project.setId(maxIdofProjectId);
            //insert project into table

            insertProject(project);

            project.getEmployeeList().forEach(emp ->{
                //get max of employee

                    int maxIdofEmpId = getMaxId("select max(id) from sonarlatest.employee_latest");
                    emp.setId(maxIdofEmpId);
                    emp.setPid(project.getId());

                    // insert employee
               insertEmp(emp);
            });


        }
    }
}
