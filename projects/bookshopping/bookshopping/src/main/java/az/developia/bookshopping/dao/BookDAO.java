package az.developia.bookshopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.bookshopping.model.Book;

public interface BookDAO extends JpaRepository<Book, Integer> {

}
