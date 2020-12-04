package andreasgroup.medicineconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MedicineConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicineConfigServerApplication.class, args);
	}

}
