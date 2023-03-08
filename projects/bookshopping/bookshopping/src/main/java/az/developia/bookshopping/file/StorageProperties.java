package az.developia.bookshopping.file;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;
@Data
@ConfigurationProperties("storage")
public class StorageProperties {
	private String location = "upload-dir-book-shopping-spring-ajax";

}
