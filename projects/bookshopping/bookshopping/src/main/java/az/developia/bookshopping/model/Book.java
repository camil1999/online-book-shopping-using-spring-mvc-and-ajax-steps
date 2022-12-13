package az.developia.bookshopping.model;

import lombok.Getter;

import lombok.Setter;

@javax.persistence.Entity
public class Book {
	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
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
