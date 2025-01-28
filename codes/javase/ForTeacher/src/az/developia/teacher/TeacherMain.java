package az.developia.teacher;

import java.time.LocalDateTime;

import az.developia.teacher.entity.TeacherEntity;
import az.developia.teacher.entity.TeacherGroupEntity;
import az.developia.teacher.exception.MyRuntimeException;
import az.developia.teacher.repository.TeacherGroupRepository;
import az.developia.teacher.repository.TeacherRepository;

public class TeacherMain {

	public static void main(String[] args) {
		
		TeacherEntity teacher = new TeacherEntity(2, "Jack", "Brown", "043", "River st.", "jack_brown", "189");
		TeacherRepository repo = new TeacherRepository();
		
		TeacherGroupEntity teacherGroup=new TeacherGroupEntity(null, "a3", LocalDateTime.now(), 2);
		
		TeacherGroupRepository groupRepo=new TeacherGroupRepository();
		
		groupRepo.addGroup(teacherGroup);
		
		groupRepo.deleteGroup(1);
		
		System.out.println(groupRepo.getAllTeacherGroup(2));
		
		try {
			String username=teacher.getUsername();
			String password=teacher.getPassword();
			
			if (repo.login(username, password)) {
				System.out.println("Loged in successfully...");
			}else {
				System.out.println("Username or password is incorrect...");
			}
			
			if (repo.checkUser(teacher.getUsername())) {
				System.out.println("This username is being used...");
			} else {
				repo.add(teacher);
			}
		} catch (MyRuntimeException e) {
			System.out.println(e.getMyMessage());
		}
	}

}
