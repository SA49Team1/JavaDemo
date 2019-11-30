package sg.edu.nus.demo;



import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;




@SpringBootApplication
public class ShawndemoApplication {

	private static final Logger log= LoggerFactory.getLogger(ShawndemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ShawndemoApplication.class, args);
	}
	
	@Bean
	  public CommandLineRunner demo(EmployeeRepository repository) {
return (args)->{log.info("Hello, Jon Snow- do you think it's cold?");
List<Employee> elist=(ArrayList<Employee>)repository.findAll();

for(Employee curEmp:repository.findAll()) {
	log.info(curEmp.toString());
	
}
log.info("Code Ends Here");
repository.save(new Employee(4,"xyz",100.0,"rst"));
for(Employee curEmp:repository.findAll()) {
	log.info(curEmp.toString());}

log.info("find by attributes");
for (Employee ce:repository.findBySalary(100.0)) {
	log.info("Finder"+ce.toString());
} ;

};

}
}