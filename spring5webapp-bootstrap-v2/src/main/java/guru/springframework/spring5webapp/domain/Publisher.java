package guru.springframework.spring5webapp.domain;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "publisher_id")
    private long id;
    private String name;

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @OneToMany
    @JoinColumn(name = "publisher_id")
    private Set<Book> books = new HashSet<>();

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Publisher(long id, String name) {
        this.id = id;
        this.name = name;
    }

}
