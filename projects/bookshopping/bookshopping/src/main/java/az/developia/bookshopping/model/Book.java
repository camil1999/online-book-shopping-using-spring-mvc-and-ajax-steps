package az.developia.bookshopping.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;

import lombok.Setter;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Integer id;
	@Getter
	@Setter
	private String name;
	@Getter
	@Setter
	private String description;
	@Getter
	@Setter
	private Double price;
	@Getter
	@Setter
	private String author;
	@Getter
	@Setter
	private Integer pageCount;
	@Getter
	@Setter
	private String image;
	@Getter
	@Setter
	private String username;
}
