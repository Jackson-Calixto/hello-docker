package br.com.erudio;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	@RequestMapping("/hello-docker")
	public HelloDocker greeting() {
		
		//var hostName = System.getenv("COMPUTERNAME"); //Local machine
		var hostName = System.getenv("HOSTNAME"); //Docker container
		
		return new HelloDocker(
					"Hello Docker",
					hostName
				);
	}
}
