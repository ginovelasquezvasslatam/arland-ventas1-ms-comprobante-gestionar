package pe.com.arland.ventas1.ms.comprobante.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
		"pe.com.arland.cliente1.registro.entity",
		"pe.com.arland.cliente1.registro.component", 
		"pe.com.arland.cliente1.registro.service",
		"pe.com.arland.ventas1.repository.mongodb",
		"pe.com.arland.ventas1.ms.comprobante.ws.rest"
		})
public class GestionarApplication {
	
	//final Logger log = LoggerFactory.getLogger(GestionarApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GestionarApplication.class, args);
		//log.
	}

}
