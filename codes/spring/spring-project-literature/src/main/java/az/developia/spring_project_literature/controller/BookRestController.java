package az.developia.spring_project_literature.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_project_literature.dto.BookRequestDto;
import az.developia.spring_project_literature.dto.BookResponseDto;
import az.developia.spring_project_literature.entity.Book;
import az.developia.spring_project_literature.exception.OurRuntimeException;
import az.developia.spring_project_literature.repository.BookRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping(path="/api/book")
public class BookRestController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping
	public List<Book> getBooks(){
		return bookRepository.findAll();
	}
	
	@PostMapping(path="/add")
	public void addBook(@Valid @RequestBody BookRequestDto dto, BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException(br,"error");
		}
		Book b = new Book();
		b.setId(null);
		b.setTitle(dto.getTitle());
		b.setAuthor(dto.getAuthor());
		b.setYear(dto.getYear());
		
		bookRepository.save(b);
	}
	
	@PutMapping(path="/update")
	public void update(@Valid @RequestBody BookRequestDto dto, BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException(br,"error");
		}
		if (dto.getId()==null || dto.getId()<=0) {
			throw new OurRuntimeException(null,"id is mandatory");
		}
		
		Optional<Book> byId = bookRepository.findById(dto.getId());
		
		if (byId.isPresent()) {
			Book book = byId.get();
			book.setId(dto.getId());
			book.setTitle(dto.getTitle());
			book.setAuthor(dto.getAuthor());
			book.setYear(dto.getYear());
			
			bookRepository.save(book);
		} else {
			throw new OurRuntimeException(null, "id can not be found");
		}
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable Integer id) {
		if (id==null || id<=0) {
			throw new OurRuntimeException(null, "id is mandatory");
		}
		Optional<Book> byId = bookRepository.findById(id);
		if (byId.isPresent()) {
			bookRepository.deleteById(id);
		}
		else {
			throw new OurRuntimeException(null, "id can not be found");
		}
		return ResponseEntity.ok("Book deleted successfully");
	}
	
	@GetMapping(path = "/{id}")
	public BookResponseDto getById(@PathVariable Integer id) {
		if (id==null || id<=0) {
			throw new OurRuntimeException(null, "id is mandatory");
		}
		Optional<Book> byId = bookRepository.findById(id);
		if (byId.isPresent()) {
			Book book = byId.get();
			BookResponseDto response = new BookResponseDto();
			response.setId(book.getId());
			response.setTitle(book.getTitle());
			response.setAuthor(book.getAuthor());
			response.setYear(book.getYear());
			return response;
		}
		else {
			throw new OurRuntimeException(null, "id can not be found");
		}
	}
	
	
}
