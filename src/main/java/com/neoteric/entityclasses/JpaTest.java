package com.neoteric.entityclasses;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class JpaTest {

    public static void main(String[] args) {



       EmployeeService service = new EmployeeService();
        List<ProjectEntity> projectEntityList =   service.projectEmpInnerjoin();

        for (int i =0;i<projectEntityList.size();i++){


            System.out.println("  Project  ::::::: " +projectEntityList.get(i));

            projectEntityList.get(i).getEmployeeEntity().forEach( emp -> {
                System.out.println(" emp "+emp);
            });
        }

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




    }
}
