package az.developia.bookshopping.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileSystemStorageService implements StorageService {

	private final Path rootLocation;

	@Autowired
	public FileSystemStorageService(StorageProperties properties) {
		this.rootLocation = Paths.get(properties.getLocation());
	}

	@Override
	public void init() {
		try {
			 Files.createDirectories(rootLocation);
			 }
			 catch (IOException e) {
			 throw new StorageException("Qovluq yaradila bilmedi", e);
			 }
			 

	}

	@Override
	public String store(MultipartFile file) {

		return null;
	}

	@Override
	public Path load(String filename) {

		return null;
	}

	@Override
	public Resource loadAsResource(String filename) {

		return null;
	}

	@Override
	public void deleteAll() {

	}

}
