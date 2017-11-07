package examples.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String [] args) throws Exception {
		ApplicationContext context = SpringApplication.run(BatchConfiguration.class, args);
		int exitCode = SpringApplication.exit(context);
		System.exit(exitCode);
	}
}
