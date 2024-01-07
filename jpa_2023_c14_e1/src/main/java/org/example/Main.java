package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Tuple;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.*;
import org.example.entities.Author;
import org.example.entities.Book;
import org.example.entities.BookShop;
import org.example.persistence.CustomPersistenceUnitInfo;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String puName = "pu-name";

        Map<String, String> props = new HashMap<>();
        props.put("hibernate.show_sql", "true");
        props.put("hibernate.hbm2ddl.auto", "none"); // create, none, update


        EntityManagerFactory emf = new HibernatePersistenceProvider()
                .createContainerEntityManagerFactory(new CustomPersistenceUnitInfo(puName), props);

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            CriteriaBuilder builder = em.getCriteriaBuilder();

            CriteriaQuery<Author> mainQuery = builder.createQuery(Author.class);
            Root<Author> authorRoot = mainQuery.from(Author.class);

            /*
                SELECT a,
                    (SELECT count(b) FROM Book b JOIN Author a ON b.id IN a.booksList) n
                FROM Author a WHERE n > 2
            */

            Subquery<Long> subquery = mainQuery.subquery(Long.class);
            Root<Author> subRootAuthor = subquery.correlate(authorRoot);
            Join<Author, Book> authorBookJoin = subRootAuthor.join("booksList");

            subquery.select(builder.count(authorBookJoin));
            mainQuery.select(authorRoot)
                    .where(builder.greaterThan(subquery, 0L));

            TypedQuery<Author> q = em.createQuery(mainQuery);
            q.getResultStream()
                    .forEach(a -> System.out.println(a));

// =====================================================================================================================
//            CriteriaQuery<Tuple> cq = builder.createTupleQuery();
//
//            Root<Book> bookRoot = cq.from(Book.class); // SELECT b FROM Book b
//            Join<Book, Author> joinAuthor = bookRoot.join("authorsList", JoinType.LEFT);
//            Join<Book, BookShop> joinBookShop = bookRoot.join("bookShopList");
//
//            cq.multiselect(bookRoot, joinAuthor, joinBookShop); // SELECT b, a FROM Book b INNER JOIN Author a
//
//            TypedQuery<Tuple> q = em.createQuery(cq);
//
//            q.getResultStream()
//                    .forEach(t -> System.out.println(t.get(0) + " " +
//                                                     t.get(1) + " " +
//                                                     t.get(2)));

            em.getTransaction().commit(); // end of transaction
        } finally {
            em.close();
        }
    }
}