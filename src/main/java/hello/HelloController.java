package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		String s = new RestTemplate().getForObject("http://localhost:8762/t1?name=5", String.class);
		return s;
	}

}