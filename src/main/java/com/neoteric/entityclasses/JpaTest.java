package com.neoteric.entityclasses;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class JpaTest {

    public static void main(String[] args) {

       JpaService jpaService = new JpaService();


        List<ProjectEntity> projectEntityList=jpaService.projectEntities();

        for(int i=0;i<projectEntityList.size();i++){


            System.out.println("project  "+  projectEntityList.get(i));

            projectEntityList.get(i).getEmployeeEntity().forEach(emap ->{
                System.out.println("emp  "  +emap);
            });
        }




    }
}
