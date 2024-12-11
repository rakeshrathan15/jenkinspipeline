package com.neoteric.entityclasses;

import jakarta.persistence.*;

import java.util.List;

public class JpaService {



    public List<ProjectEntity> projectEntities(){

        String query="select p from ProjectEntity p left join p.employeeEntity e ";
       EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("jpaDemo");
       EntityManager entityManager= entityManagerFactory.createEntityManager();

       entityManager.getTransaction().begin();
       List<ProjectEntity> projectEntityList= entityManager.createQuery(query).getResultList();

       entityManager.getTransaction().commit();

       return projectEntityList;


    }

}
