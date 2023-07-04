package main;

import java.util.List;

import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import entities.Employee;
import entities.Product;

public class Main {

	/*
	 * SQL92
	 * 
	 * SQL - SELECT * FROM product p (native queries) JPQL - SELECT p FROM Product p
	 */
	public static void main(String[] args) {
		var emf = Persistence.createEntityManagerFactory("my-persistence-unit");
		var em = emf.createEntityManager();

		em.getTransaction().begin();

		String jpql;
		TypedQuery<Product> q;
		List<Product> products;
		jpql = "SELECT p FROM Product p";
		jpql = "SELECT p FROM Product p WHERE p.price = 10";
		// Query q = em.createQuery(jpql);
		q = em.createQuery(jpql, Product.class);
		products = q.getResultList();
		products.forEach(System.out::println);

		jpql = "SELECT p FROM Product p WHERE p.price > :price";
		q = em.createQuery(jpql, Product.class);
		q.setParameter("price", 10.0);
		products = q.getResultList();
		products.forEach(System.out::println);

		jpql = "SELECT p FROM Product p WHERE p.price > ?1";
		q = em.createQuery(jpql, Product.class);
		q.setParameter(1, 10.0);
		products = q.getResultList();
		products.forEach(System.out::println);

		jpql = "SELECT SUM(p.price) FROM Product p WHERE p.price > :price";
		TypedQuery<Double> q2;
		q2 = em.createQuery(jpql, Double.class);
		q2.setParameter("price", 10.0);
		double sum = q2.getSingleResult();
		System.out.println(sum);

		System.out.println("Named queries:");
		q = em.createNamedQuery("Product.all", Product.class);
		q.getResultStream().filter(p -> p.getPrice() > 10).forEach(System.out::println);

		System.out.println("Native queries:");
        String sql = "SELECT * FROM product p";
        Query q_sql = em.createNativeQuery(sql, Product.class);
        products = q_sql.getResultList();
        products.forEach(System.out::println);

        System.out.println("Employees of department 1:");
        jpql = "SELECT e FROM Employee e, Department d WHERE e.department = d AND d.id = :id";
        TypedQuery<Employee> tq = em.createQuery(jpql, Employee.class);
        tq.setParameter("id", 1);

        List<Employee> list = tq.getResultList();
        list.forEach(System.out::println);

		em.getTransaction().commit();
		em.close();
	}
}
