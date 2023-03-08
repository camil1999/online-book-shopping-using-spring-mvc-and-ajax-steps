package az.developia.bookshopping.file;

import java.nio.file.Path;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileSystemStorageService implements StorageService {

	@Override
	public void init() {
		
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
