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
import az.developia.spring_project_literature.service.BookService;
import jakarta.validation.Valid;

@RestController
@RequestMapping(path="/api/book")
public class BookRestController {
	
	@Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping(path = "/add")
    public void addBook(@Valid @RequestBody BookRequestDto dto, BindingResult br) {
        if (br.hasErrors()) {
            throw new OurRuntimeException(br, "error");
        }
        bookService.addBook(dto);
    }

    @PutMapping(path = "/update")
    public void update(@Valid @RequestBody BookRequestDto dto, BindingResult br) {
        if (br.hasErrors()) {
            throw new OurRuntimeException(br, "error");
        }
        bookService.updateBook(dto);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Integer id) {
        bookService.deleteBook(id);
        return ResponseEntity.ok("Book deleted successfully");
    }

    @GetMapping(path = "/{id}")
    public BookResponseDto getById(@PathVariable Integer id) {
        return bookService.getBookById(id);
    }
}
