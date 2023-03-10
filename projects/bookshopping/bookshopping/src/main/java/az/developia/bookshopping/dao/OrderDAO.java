package az.developia.bookshopping.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.bookshopping.model.Order;

public interface OrderDAO extends JpaRepository<Order, Integer> {
	List<Order> findByUsername(String username);
}
