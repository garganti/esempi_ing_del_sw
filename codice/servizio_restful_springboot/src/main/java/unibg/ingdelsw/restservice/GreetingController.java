package unibg.ingdelsw.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	//private final AtomicLong counter = new AtomicLong();
	private long counter = 0;
	

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(defaultValue = "World") String name) {
		//return new Greeting(counter.incrementAndGet(), template.formatted(name));		
		return new Greeting(counter, template.formatted(name));
	}
//	public String greeting() {
//		return "ciao";		
//	}
}
