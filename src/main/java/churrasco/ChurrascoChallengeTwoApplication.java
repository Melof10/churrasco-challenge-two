package churrasco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("churrasco.repositories")
@EntityScan("churrasco.entities")
public class ChurrascoChallengeTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChurrascoChallengeTwoApplication.class, args);
	}

}
