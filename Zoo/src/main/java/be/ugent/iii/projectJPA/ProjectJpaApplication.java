package be.ugent.iii.projectJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("be.ugent.iii")
public class ProjectJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectJpaApplication.class, args);
	}
}
