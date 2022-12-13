package az.developia.bookshopping.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
	@NotEmpty(message = "Ad hissəsini boş qoymaq olmaz!")
	@Size(max = 12, message = "Ad maksimum 12 simvoldan ibarət olmalıdır!")
	@Size(min = 4, message = "Ad minimum 4 simvoldan ibarət olmalıdır!")
	private String name;
	@Getter
	@Setter
	@NotEmpty(message = "Təsvir hissəsini boş qoymaq olmaz!")
	private String description;
	@Getter
	@Setter
	@NotNull(message = "Qiymət hissəsini boş qoymaq olmaz!")
	private Double price;
	@Getter
	@Setter
	@NotEmpty(message = "Müəllif hissəsini boş qoymaq olmaz!")
	private String author;
	@Getter
	@Setter
	@NotNull(message = "Səhifə sayı hissəsini boş qoymaq olmaz!")
	private Integer pageCount;
	@Getter
	@Setter
	private String image;
	@Getter
	@Setter
	private String username;
}
