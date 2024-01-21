package org.example.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "authors")
@NamedEntityGraphs({
        @NamedEntityGraph(
            name = "Author.eagerlyFetchBooks",
            attributeNodes = @NamedAttributeNode("booksList")
        ),
        @NamedEntityGraph(
                name = "Author.eagerlyFetchBookShops",
                subgraphs = @NamedSubgraph(
                        name = "booksList",
                        type = Book.class,
                        attributeNodes = @NamedAttributeNode("booksList")
                )
        )
})
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToMany
    private Set<Book> booksList;

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

    public Set<Book> getBooksList() {
        return booksList;
    }

    public void setBooksList(Set<Book> booksList) {
        this.booksList = booksList;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
