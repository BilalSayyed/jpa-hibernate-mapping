//package com.busycoder.controller;
//
//import com.busycoder.entity.Department;
//import com.busycoder.entity.Employee;
//import org.hibernate.HibernateException;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import java.util.List;
//
//public class A_AddEmployee {
//    public static void main(String[] args) {
//        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("busycoder");
//        EntityManager  entityManager=entityManagerFactory.createEntityManager();
//        EntityTransaction entityTransaction=entityManager.getTransaction();
//        try {
//         entityTransaction.begin();
////            Department department1=new Department("IT");
////            Department department2=new Department("H/W");
////
////            Employee employee=new Employee("Javed1",50000.00,department1);
////
////            Employee employee2=new Employee("Jahir2",40000.00,department1);
////
////            Employee employee3=new Employee("Jamil3",30000.00,department2);
////            entityManager.persist(department1);
////            entityManager.persist(department2);
////            entityManager.persist(employee);
////            entityManager.persist(employee2);
////            entityManager.persist(employee3);
//
////             To Solve n+1 problem
////            List<Employee> employees=entityManager.createQuery("from Employee e join fetch e.dept Department ",Employee.class).getResultList();
////            System.out.println(employees);
//            entityTransaction.commit();
//        }
//        catch (HibernateException e)
//        {
//            System.out.println(e);
//            entityTransaction.rollback();
//        }
//        entityManager.close();
//        entityManagerFactory.close();
//    }
//}
