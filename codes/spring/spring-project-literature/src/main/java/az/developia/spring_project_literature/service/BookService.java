package az.developia.spring_project_literature.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.developia.spring_project_literature.dto.BookRequestDto;
import az.developia.spring_project_literature.dto.BookResponseDto;
import az.developia.spring_project_literature.entity.Book;
import az.developia.spring_project_literature.exception.OurRuntimeException;
import az.developia.spring_project_literature.repository.BookRepository;

@Service
public class BookService {
	@Autowired
    private BookRepository bookRepository;

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public void addBook(BookRequestDto dto) {
        Book b = new Book();
        b.setId(null);
        b.setTitle(dto.getTitle());
        b.setAuthor(dto.getAuthor());
        b.setYear(dto.getYear());

        bookRepository.save(b);
    }
    
	public List<Book> search(String query) {
		List<Book> all = bookRepository.findAll();
		if (query==null) {
			return all;
		}
		return all.stream().filter(book -> book.getTitle().toLowerCase().contains(query.toLowerCase()))
				.collect(Collectors.toList());
	}

    public void updateBook(BookRequestDto dto) {
        if (dto.getId() == null || dto.getId() <= 0) {
            throw new OurRuntimeException(null, "id is mandatory");
        }

        Optional<Book> byId = bookRepository.findById(dto.getId());
        if (byId.isPresent()) {
            Book book = byId.get();
            book.setTitle(dto.getTitle());
            book.setAuthor(dto.getAuthor());
            book.setYear(dto.getYear());
            bookRepository.save(book);
        } else {
            throw new OurRuntimeException(null, "id cannot be found");
        }
    }

    public void deleteBook(Integer id) {
        if (id == null || id <= 0) {
            throw new OurRuntimeException(null, "id is mandatory");
        }

        Optional<Book> byId = bookRepository.findById(id);
        if (byId.isPresent()) {
            bookRepository.deleteById(id);
        } else {
            throw new OurRuntimeException(null, "id cannot be found");
        }
    }

    public BookResponseDto getBookById(Integer id) {
        if (id == null || id <= 0) {
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
        } else {
            throw new OurRuntimeException(null, "id cannot be found");
        }
    }
}
