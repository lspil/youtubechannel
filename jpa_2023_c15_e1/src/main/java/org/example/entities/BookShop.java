package org.example.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "book_shops")
public class BookShop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToMany
    private List<Book> booksList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Book> booksList) {
        this.booksList = booksList;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
