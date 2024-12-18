package com.neoteric.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class AccountService {

    public static void main(String[] args) {
                // Step 1: Create EntityManagerFactory and EntityManager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpaDemo");
        EntityManager em = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = null;

        try {
            transaction = em.getTransaction();
            transaction.begin();


           AdharEntity adharEntity= new AdharEntity();
           adharEntity.setAdharNumber(123);
           adharEntity.setName("rakesh");


           AccountEntity accountEntity= new AccountEntity();



            transaction.commit(); // Commit the transaction

            System.out.println("Data inserted successfully!");

        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback(); // Rollback the transaction in case of error
            }
            e.printStackTrace();
        } finally {
            // Close EntityManager and EntityManagerFactory
            em.close();
            entityManagerFactory.close();
        }
    }
}
