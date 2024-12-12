package com.neoteric.entityclasses;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class EmployeeService {

    public List<ProjectEntity> getEmpProjectMap(){

        EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("jpaDemo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//select * from sonar.Project p inner join  sonar.Employee e on p.id=e.pid

        entityManager.getTransaction().begin();



        Query query =  entityManager
                .createQuery(" select  p from ProjectEntity p  ",
                        ProjectEntity.class);
        List<ProjectEntity> projectEntities = query.getResultList();
        entityManager.getTransaction().commit();
        return projectEntities;
    }

    public List<ProjectEntity> projectEmpInnerjoin(){

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("jpaDemo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//select * from sonar.Project p inner join  sonar.Employee e on p.id=e.pid

        entityManager.getTransaction().begin();



        Query query =  entityManager
                .createQuery(" select  p from ProjectEntity p inner join p.employeeEntity e  ",
                        ProjectEntity.class);
        List<ProjectEntity> projectEntities = query.getResultList();
        entityManager.getTransaction().commit();
        return projectEntities;
    }

    public List<ProjectEntity> nplusone(){

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("jpaDemo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//select * from sonar.Project p inner join  sonar.Employee e on p.id=e.pid

        entityManager.getTransaction().begin();



        Query query =  entityManager
                .createQuery(" select  distinct(p) from ProjectEntity p join fetch p.employeeEntity ",
                        ProjectEntity.class);
        List<ProjectEntity> projectEntities = query.getResultList();
        entityManager.getTransaction().commit();
        return projectEntities;
    }

    public List<ProjectEntity> getProjectsAndEmployeesBySalary(double minSalary) {

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("jpaDemo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();


        Query query = entityManager.createQuery(
                "SELECT DISTINCT p FROM ProjectEntity p " +
                        "JOIN p.employeeEntity e " +
                        "WHERE e.salary > :minSalary",
                ProjectEntity.class
        );

//        Query query = entityManager.createQuery(
//                "SELECT p FROM ProjectEntity p WHERE p.salary > :minSalary",
//                ProjectEntity.class
//        );




        query.setParameter("minSalary", minSalary);

        List<ProjectEntity> projectEntities = query.getResultList();
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return projectEntities;

    }

}
