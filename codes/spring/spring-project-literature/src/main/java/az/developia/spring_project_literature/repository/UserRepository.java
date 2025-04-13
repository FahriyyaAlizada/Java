package az.developia.spring_project_literature.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.spring_project_literature.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
