package tbp.spring.retry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tbp.spring.retry.service.AdharServiceInvoker;

@RestController
public class AdharInvokerController {
	@Autowired
	AdharServiceInvoker adharInvokerController;

	@GetMapping(value = "/getAdhar", consumes = "application/json", produces = "application/json")
	public String getAdharDetails(@RequestParam("adhar") String adhar) {
		// return
		return adharInvokerController.invoke(adhar);
	}

}
