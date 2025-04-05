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
import jakarta.validation.Valid;

@RestController
@RequestMapping(path="/api/reader")
public class ReaderRestController {

	@Autowired
	private ReaderRepository readerRepository;
	
	@GetMapping
	public List<Reader> getReaders(){
		return readerRepository.findAll();
	}
	
	@PostMapping(path="/add")
	public void addReader(@Valid @RequestBody ReaderRequestDto dto, BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException(br,"error");
		}
		Reader r = new Reader();
		r.setId(null);
		r.setName(dto.getName());
		r.setAge(dto.getAge());
		r.setEmail(dto.getEmail());
		
		readerRepository.save(r);
	}
	
	@PutMapping(path="/update")
	public void update(@Valid @RequestBody ReaderRequestDto dto, BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException(br,"error");
		}
		if (dto.getId()==null || dto.getId()<=0) {
			throw new OurRuntimeException(null,"id is mandatory");
		}
		
		Optional<Reader> byId = readerRepository.findById(dto.getId());
		
		if (byId.isPresent()) {
			Reader reader = byId.get();
			reader.setId(dto.getId());
			reader.setName(dto.getName());
			reader.setAge(dto.getAge());
			reader.setEmail(dto.getEmail());
			
			readerRepository.save(reader);
		} else {
			throw new OurRuntimeException(null, "id can not be found");
		}
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<String> deleteReader(@PathVariable Integer id) {
		if (id==null || id<=0) {
			throw new OurRuntimeException(null, "id is mandatory");
		}
		Optional<Reader> byId = readerRepository.findById(id);
		if (byId.isPresent()) {
			readerRepository.deleteById(id);
		}
		else {
			throw new OurRuntimeException(null, "id can not be found");
		}
		return ResponseEntity.ok("Reader deleted successfully");
	}
	
	@GetMapping(path = "/{id}")
	public ReaderResponseDto getById(@PathVariable Integer id) {
		if (id==null || id<=0) {
			throw new OurRuntimeException(null, "id is mandatory");
		}
		Optional<Reader> byId = readerRepository.findById(id);
		if (byId.isPresent()) {
			Reader reader = byId.get();
			ReaderResponseDto response = new ReaderResponseDto();
			response.setId(reader.getId());
			response.setName(reader.getName());
			response.setAge(reader.getAge());
			response.setEmail(reader.getEmail());
			return response;
		}
		else {
			throw new OurRuntimeException(null, "id can not be found");
		}
	}
}
