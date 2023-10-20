package org.yul.github.universe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class UniverseScheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniverseScheduleApplication.class, args);
	}

}
