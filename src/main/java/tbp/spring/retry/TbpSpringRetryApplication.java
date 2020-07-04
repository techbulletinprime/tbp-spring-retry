package tbp.spring.retry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class TbpSpringRetryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TbpSpringRetryApplication.class, args);
	}

}
