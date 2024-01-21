package org.example.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;

    @ManyToMany(mappedBy = "booksList")
    private Set<Author> authorsList;

    @ManyToMany(mappedBy = "booksList")
    private Set<BookShop> bookShopList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Author> getAuthorsList() {
        return authorsList;
    }

    public void setAuthorsList(Set<Author> authors) {
        this.authorsList = authors;
    }

    public Set<BookShop> getBookShopList() {
        return bookShopList;
    }

    public void setBookShopList(Set<BookShop> bookShopList) {
        this.bookShopList = bookShopList;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
