package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {

	@Value("${server.port}")
	String port;

	@RequestMapping("/t1")
	public String home(@RequestParam String name) {
		return "hi " + name + ",i am from port:" + port;
	}

}
