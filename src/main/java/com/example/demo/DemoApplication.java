package com.example.demo;

import com.exacttarget.fuelsdk.ETConfiguration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:beans.xml")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			ETConfiguration etConfiguration = ctx.getBean("etConfiguration", ETConfiguration.class);

			assert "val1".equals(etConfiguration.get("key1"));
			assert "val2".equals(etConfiguration.get("key2"));
			assert !(etConfiguration.get("key3") == null);
		};
	}

}
