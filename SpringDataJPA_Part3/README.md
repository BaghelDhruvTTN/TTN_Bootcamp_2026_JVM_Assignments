
# Hibernate Assignment – Entity Mapping and Persistence

## Overview

This project demonstrates various Hibernate ORM mapping techniques and persistence operations using Java and MySQL. It covers embedded objects, collections, and different types of entity relationships including One-to-One, One-to-Many, and Many-to-Many mappings, along with cascade operations, cache management, and transaction management.

Hibernate is used to map Java objects (entities) to relational database tables and manage persistence automatically.

---

## Q1) Create Address class with streetNumber, location, state

An `Address` class is created as an embeddable object using the `@Embeddable` annotation.

This means Address does not have its own table. Its fields are stored inside the Author table.

Example:

```java
@Embeddable
public class Address {

    private String streetNumber;
    private String location;
    private String state;

}
```

---

## Q2) Embed Address object inside Author class

The Address object is embedded inside Author using the `@Embedded` annotation.

```java
@Embedded
private Address address;
```

Hibernate stores address fields in the Author table.

---

## Q3) Introduce List of subjects for Author

A list of subjects is added using `@ElementCollection`.

```java
@ElementCollection
@CollectionTable(
    name = "author_subjects",
    joinColumns = @JoinColumn(name = "author_id")
)
@Column(name = "subject")
private List<String> subjects;
```

Hibernate creates a separate table (`author_subjects`) to store subjects.

---

## Q4) Persist 3 subjects for each author

Example:

```java
author.getSubjects().add("Physics");
author.getSubjects().add("Math");
author.getSubjects().add("Computer Science");

session.persist(author);
```

Hibernate stores subjects in a collection table.

---

## Q5) Create Book entity with bookName

Book entity is created using `@Entity`.

```java
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bookName;

}
```

---

## Q6) Implement One-to-One mapping between Author and Book

One Author is associated with one Book.

```java
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "one_to_one_book_id")
private Book oneToOneBook;
```

Hibernate creates a foreign key in Author table.

---

## Q7) Implement One-to-Many mapping between Author and Book

### Unidirectional One-to-Many

```java
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name = "uni_author_id")
private List<Book> uniDirectionalBooks;
```

Foreign key is stored in Book table.

---

### Bidirectional One-to-Many

Author side:

```java
@OneToMany(
    mappedBy = "author",
    cascade = CascadeType.ALL,
    orphanRemoval = true
)
private List<Book> biDirectionalBooks;
```

Book side:

```java
@ManyToOne
@JoinColumn(name = "author_id")
private Author author;
```

Book owns the relationship.

---

### Cascade Save

CascadeType.ALL ensures related books are automatically saved when Author is saved.

```java
session.persist(author);
```

All associated books are also persisted automatically.

---

## Q8) Implement Many-to-Many mapping between Author and Book

Multiple Authors can have multiple Books.

Author side:

```java
@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(
    name = "author_book_many_to_many",
    joinColumns = @JoinColumn(name = "author_id"),
    inverseJoinColumns = @JoinColumn(name = "book_id")
)
private List<Book> manyToManyBooks;
```

Hibernate creates a join table.

---

## Q9) Which method removes an object from Session cache?

The `evict(Object object)` method removes an object from the first-level cache.

Example:

```java
Author author = session.get(Author.class, 1L);

session.evict(author);
```

After eviction, Hibernate no longer manages the object in the session cache.

---

## Q10) What does @Transactional annotation do?

The `@Transactional` annotation defines a transaction boundary.

It ensures:

• All operations inside the method run in one transaction
• Transaction is committed if successful
• Transaction is rolled back if an exception occurs

Example:

```java
@Transactional
public void saveAuthor(Author author) {
    session.persist(author);
}
```

This ensures data consistency and integrity.

---

## Technologies Used

* Java
* Hibernate ORM
* MySQL
* Maven
* JPA Annotations

---

## Conclusion

This project demonstrates how Hibernate maps Java objects to database tables, manages relationships, handles caching, and controls transactions. It shows how complex object relationships can be persisted efficiently using ORM.

---

## Project Structure

``
SpringDataJPA_Part3/
│
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── assignment/
│                   └── Springdatajpa/
│                       ├── entity/
│                       │   ├── Address.java
│                       │   ├── Author.java
│                       │   └── Book.java
│                       └── SpringDataJpaPart3Application.java
├── pom.xml
└── README.md
``
