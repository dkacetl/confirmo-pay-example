package net.confirmo.appexample;

import net.confirmo.appexample.db.InvoiceRepository;
import net.confirmo.spring.EnableConfirmo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.TimeZone;

@SpringBootApplication
@EnableConfirmo
@EnableJpaRepositories(basePackageClasses = {InvoiceRepository.class})
@EnableTransactionManagement
@Import({ConfirmoPayExampleProperties.class})
public class ConfirmoPayExampleApplication {

	public static void main(String[] args) {
		// It is a global-world service, set UTC as local time.
		// all date/times will be stored in UTC.
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));

		SpringApplication springApplication = new SpringApplication(ConfirmoPayExampleApplication.class);
		springApplication.addListeners(new ApplicationPidFileWriter());
		springApplication.run(args);
	}

}
