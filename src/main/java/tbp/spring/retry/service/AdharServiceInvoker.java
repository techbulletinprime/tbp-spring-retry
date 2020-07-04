package tbp.spring.retry.service;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class AdharServiceInvoker {
	int counter = 1;

	@Retryable(maxAttempts = 3, value = { RuntimeException.class }, backoff = @Backoff(delay = 2000, multiplier = 2))
	public String invoke(String adhar) {

		// Dummy
		System.out.println("Executed " + counter);
		counter++;
		throw new RuntimeException("Some random Exception");

	}

	@Recover
	public String recover(RuntimeException e, String adhar) {
		return "not able to connect adhar portal at this moment";
	}

}
