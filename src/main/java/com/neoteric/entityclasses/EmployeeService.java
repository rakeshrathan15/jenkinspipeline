package com.neoteric.entityclasses;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class EmployeeService {

    public List<ProjectEntity> getEmpProjectMap(){

        EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("");
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
                Persistence.createEntityManagerFactory("");
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
                Persistence.createEntityManagerFactory("");
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

    public List<EmployeeEntity> getProjectsAndEmployeesBySalary(double minSalary) {

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();


//        Query query = entityManager.createQuery(
//                "SELECT DISTINCT p FROM ProjectEntity p " +
//                        "JOIN p.employeeEntity e " +
//                        "WHERE e.salary > :minSalary",
//                ProjectEntity.class
//        );

        Query query = entityManager.createQuery(
                "SELECT e FROM EmployeeEntity e WHERE e.salary > :minSalary",
                EmployeeEntity.class);


        query.setParameter("minSalary", minSalary);

        List<EmployeeEntity> projectEntities = query.getResultList();
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return projectEntities;

    }



    public static List<EmployeeEntity> criteriaQuery(String deptname , double minsalary) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<EmployeeEntity> criteriaQuery = criteriaBuilder.createQuery(EmployeeEntity.class);
        Root<EmployeeEntity> entityRoot = criteriaQuery.from(EmployeeEntity.class);
        Predicate departmentPredicate = criteriaBuilder.equal(entityRoot.get("dept"), deptname);
        Predicate salaryPredicate = criteriaBuilder.greaterThanOrEqualTo(entityRoot.get("salary"), minsalary);
        criteriaQuery.select(entityRoot)
                .where(criteriaBuilder.or(departmentPredicate, salaryPredicate))
                .orderBy(criteriaBuilder.asc(entityRoot.get("salary")));
        TypedQuery<EmployeeEntity> query = entityManager.createQuery(criteriaQuery);
        List<EmployeeEntity> employees = query.getResultList();
        return employees;

    }

}
