package az.developia.bookshopping.model;

import lombok.Data;

@Data
public class SearchModel {
	private String search;
	private Integer begin;
	private Integer length;
}
