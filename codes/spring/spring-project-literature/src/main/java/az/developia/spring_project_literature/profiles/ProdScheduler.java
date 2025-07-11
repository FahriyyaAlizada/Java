package az.developia.spring_project_literature.profiles;

import org.springframework.context.annotation.Profile;
//import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Profile(value = {"production"})
public class ProdScheduler {
	
//	@Scheduled(fixedRate = 3000)
//	public void doIt() {
//		System.out.println("Production Scheduler");
//	}
	
}
