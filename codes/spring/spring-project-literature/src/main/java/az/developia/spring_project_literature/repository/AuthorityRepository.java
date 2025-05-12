package az.developia.spring_project_literature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.spring_project_literature.entity.Authorities;

public interface AuthorityRepository extends JpaRepository<Authorities, Integer>{
	
	List<Authorities> findByUsername(String username);
}
