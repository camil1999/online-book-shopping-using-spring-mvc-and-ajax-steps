package az.developia.bookshopping.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class User {
	@Size(min = 1, message = "Adı minimum 1 simvol olmalıdır!")
	@Size(max = 10, message = "Adı maksimum 1 simvol olmalıdır!")
	@NotEmpty(message = "Boş qoymaq olmaz!")
	private String username;
	@Size(min = 1, message = "Şifrə minimum 1 simvol olmalıdır!")
	@Size(max = 10, message = "Şifrə maksimum 1 simvol olmalıdır!")
	@NotEmpty(message = "Boş qoymaq olmaz!")
	private String password;
}