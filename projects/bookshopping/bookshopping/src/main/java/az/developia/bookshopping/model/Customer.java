package az.developia.bookshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotEmpty(message = "Ad hissəsini boş qoymaq olmaz!")
	@Size(max = 30, message = "Ad maksimum 30 simvoldan ibarət olmalıdır!")
	@Size(min = 4, message = "Ad minimum 4 simvoldan ibarət olmalıdır!")
	@Column(columnDefinition="VARCHAR(30)")
	private String name;
	@NotEmpty(message = "Ünvan hissəsini boş qoymaq olmaz!")
	@Size(max = 200, message = "Ünvan maksimum 200 simvoldan ibarət olmalıdır!")
	@Size(min = 4, message = "Ünvan minimum 4 simvoldan ibarət olmalıdır!")
	@Column(columnDefinition="VARCHAR(200)")
	private String address;
	@NotEmpty(message = "Telefon hissəsini boş qoymaq olmaz!")
	@Pattern(regexp = "[0-9]{3}-[0-9]{3}-[0-9]{2}-[0-9]{2}", message = "Telefon nömrəsini düzgün daxil edin! Məsələn: 000-000-00-00")
	@Column(columnDefinition="VARCHAR(20)")
	@Size(max = 30, message = "Telefon maksimum 30 simvoldan ibarət olmalıdır!")
	private String phone;
	@NotEmpty(message = "Email-i hissəsini boş qoymaq olmaz!")
	@Pattern(regexp = "[a-z0-9]+@[a-z]+\\.[a-z]{2,4}", message = "E-mail düzgün yazılmayıb!")
	@Size(max = 100, message = "Maksimum 100 simvoldan ibarət olmalıdır!")
	@Column(columnDefinition="VARCHAR(100)")
	private String email;
	@Column(columnDefinition="VARCHAR(100)")
	@Size(max = 100, message = "Qeyd maksimum 100 simvoldan ibarət olmalıdır!")
	private String note;

}
