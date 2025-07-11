package az.developia.spring_project_literature.profiles;

import org.springframework.context.annotation.Profile;
//import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Profile(value = {"development"})
public class DevScheduler {

//	@Scheduled(fixedRate = 2000)
//	public void doIt() {
//		System.out.println("Development Scheduler");
//	}
	
}
