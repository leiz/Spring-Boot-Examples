package me.xlui.spring;

import me.xlui.spring.service.AnnotationService;
import me.xlui.spring.service.MethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private AnnotationService annotationService;
	@Autowired
	private MethodService methodService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		annotationService.add();
		methodService.add();
	}
}
