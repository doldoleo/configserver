package fivefinger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ConfigController {
	@Value("${spring.kafka.bootstrap-servers}")
	private String url;
	
	@GetMapping("/getKafkaURL")
	public String geKafkaURL() {
		log.debug(url);
		return url; 
	}
}
