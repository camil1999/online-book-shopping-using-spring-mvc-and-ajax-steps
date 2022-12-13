package az.developia.bookshopping.model;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@javax.persistence.Entity
public class Book {
	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	private Integer id;
	@NotEmpty(message = "Ad hissəsini boş qoymaq olmaz!")
	@Size(max = 30, message = "Ad maksimum 30 simvoldan ibarət olmalıdır!")
	@Size(min = 4, message = "Ad minimum 4 simvoldan ibarət olmalıdır!")
	@Column(columnDefinition="VARCHAR(30)")
	private String name;
	@Size(max = 300, message = "Təsvir maksimum 300 simvoldan ibarət olmalıdır!")
	@Column(columnDefinition="VARCHAR(300)")
	private String description;
	@NotNull(message = "Qiymət hissəsini boş qoymaq olmaz!")
	@Min(value=0, message="Qiymət minimum 0 olmalıdır")
	private Double price;
	@Column(columnDefinition="VARCHAR(30)")
	@Size(max = 30, message = "Müəllif adı maksimum 30 simvoldan ibarət olmalıdır!")
	
	private String author;
	@NotNull(message = "Səhifə sayı hissəsini boş qoymaq olmaz!")
	private Integer pageCount;
	private String image;

	private String username;
}
