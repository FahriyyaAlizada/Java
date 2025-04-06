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

import az.developia.spring_project_literature.dto.ReaderRequestDto;
import az.developia.spring_project_literature.dto.ReaderResponseDto;
import az.developia.spring_project_literature.entity.Reader;
import az.developia.spring_project_literature.exception.OurRuntimeException;
import az.developia.spring_project_literature.repository.ReaderRepository;
import az.developia.spring_project_literature.service.ReaderService;
import jakarta.validation.Valid;

@RestController
@RequestMapping(path="/api/reader")
public class ReaderRestController {

	@Autowired
    private ReaderService readerService;

    @GetMapping
    public List<Reader> getReaders() {
        return readerService.getReaders();
    }

    @PostMapping(path="/add")
    public void addReader(@Valid @RequestBody ReaderRequestDto dto, BindingResult br) {
        if (br.hasErrors()) {
            throw new OurRuntimeException(br,"error");
        }
        readerService.addReader(dto);
    }

    @PutMapping(path="/update")
    public void update(@Valid @RequestBody ReaderRequestDto dto, BindingResult br) {
        if (br.hasErrors()) {
            throw new OurRuntimeException(br,"error");
        }
        readerService.updateReader(dto);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deleteReader(@PathVariable Integer id) {
        readerService.deleteReader(id);
        return ResponseEntity.ok("Reader deleted successfully");
    }

    @GetMapping(path = "/{id}")
    public ReaderResponseDto getById(@PathVariable Integer id) {
        return readerService.getReaderById(id);
    }
}
