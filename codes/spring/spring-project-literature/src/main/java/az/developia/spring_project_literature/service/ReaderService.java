package az.developia.spring_project_literature.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.developia.spring_project_literature.dto.ReaderRequestDto;
import az.developia.spring_project_literature.dto.ReaderResponseDto;
import az.developia.spring_project_literature.entity.Reader;
import az.developia.spring_project_literature.exception.OurRuntimeException;
import az.developia.spring_project_literature.repository.ReaderRepository;

@Service
public class ReaderService {
	
	@Autowired
    private ReaderRepository readerRepository;

    public List<Reader> getReaders() {
        return readerRepository.findAll();
    }

    public void addReader(ReaderRequestDto dto) {
        Reader r = new Reader();
        r.setId(null);
        r.setName(dto.getName());
        r.setAge(dto.getAge());
        r.setEmail(dto.getEmail());
        
        readerRepository.save(r);
    }

    public void updateReader(ReaderRequestDto dto) {
        if (dto.getId() == null || dto.getId() <= 0) {
            throw new OurRuntimeException(null, "id is mandatory");
        }

        Optional<Reader> byId = readerRepository.findById(dto.getId());
        if (byId.isPresent()) {
            Reader reader = byId.get();
            reader.setName(dto.getName());
            reader.setAge(dto.getAge());
            reader.setEmail(dto.getEmail());
            readerRepository.save(reader);
        } else {
            throw new OurRuntimeException(null, "id cannot be found");
        }
    }

    public void deleteReader(Integer id) {
        if (id == null || id <= 0) {
            throw new OurRuntimeException(null, "id is mandatory");
        }

        Optional<Reader> byId = readerRepository.findById(id);
        if (byId.isPresent()) {
            readerRepository.deleteById(id);
        } else {
            throw new OurRuntimeException(null, "id cannot be found");
        }
    }

    public ReaderResponseDto getReaderById(Integer id) {
        if (id == null || id <= 0) {
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
        } else {
            throw new OurRuntimeException(null, "id cannot be found");
        }
    }
}
