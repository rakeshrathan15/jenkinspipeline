package com.neoteric.entityclasses;

import jakarta.persistence.*;

import java.util.List;

public class JpaService {



    public List<ProjectEntity> projectEntities(){

        String query="select p from ProjectEntity p inner join p.employeeEntity e where p.id=e.pid ";
       EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("jpaDemo");
       EntityManager entityManager= entityManagerFactory.createEntityManager();

       entityManager.getTransaction().begin();

     //  Query query1 = entityManager.createQuery("select ")
       List<ProjectEntity> projectEntityList= entityManager.createQuery(query, ProjectEntity.class).getResultList();

       entityManager.getTransaction().commit();

       return projectEntityList;


    }

    public List<ProjectEntity> nPluseOneProblem(){

     //   String query="select p from ProjectEntity p inner join p.employeeEntity e where p.id=e.pid ";
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("jpaDemo");
        EntityManager entityManager= entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

     Query query= entityManager.createQuery("select distinct(p) from ProjectEntity p join fetch p.empemployeeEntity", ProjectEntity.class);
        List<ProjectEntity> projectEntityList1=query.getResultList();
        entityManager.getTransaction().commit();

        return projectEntityList1;


    }




}
