package az.developia.bookshopping.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import az.developia.bookshopping.model.Book;

public interface BookDAO extends JpaRepository<Book, Integer> {
	List<Book> findByUsername(String username);
@Query(value="select * from book where name like %?1%",nativeQuery =true)
	List<Book> findAllSearch(String search);

}
