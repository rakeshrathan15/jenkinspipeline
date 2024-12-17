package com.neoteric.jpaonetomanyinserts;

import com.neoteric.entityclasses.EmployeeEntity;
import com.neoteric.entityclasses.EmployeeService;

import java.util.List;

public class JpaTest {

    public static void main(String[] args) {



       EmployeeService service = new EmployeeService();
//        List<ProjectEntity> projectEntityList =   service.projectEmpInnerjoin();
//
//        for (int i =0;i<projectEntityList.size();i++){
//
//
//            System.out.println("  Project  ::::::: " +projectEntityList.get(i));
//
//            projectEntityList.get(i).getEmployeeEntity().forEach( emp -> {
//                System.out.println(" emp "+emp);
//            });
//        }

//        System.out.println(projectEntityList);



//        List<ProjectEntity> projectEntityList2 =   service.nplusone();
//
//        for (int i =0;i<projectEntityList2.size();i++){
//
//
//            System.out.println("  Project  ::::::: " +projectEntityList2.get(i));
//
//            projectEntityList2.get(i).getEmployeeEntity().forEach( emp -> {
//                System.out.println(" emp "+emp);
//            });
//        }

       // System.out.println(projectEntityList2);


//        List<EmployeeEntity> employess = service.getProjectsAndEmployeesBySalary(100000);
//
//        employess.forEach(employee -> {
//                System.out.println("Employee: " + employee.getName() + ", Salary: " + employee.getSalary());
//
//            });


        List<EmployeeEntity> criteriaQuery = service.criteriaQuery("CSE",50000.0);
        criteriaQuery.forEach(employee -> System.out.println("Employee Name: " + employee.getName()
                + " Employee Salary" + employee.getSalary()));






        }


    }

