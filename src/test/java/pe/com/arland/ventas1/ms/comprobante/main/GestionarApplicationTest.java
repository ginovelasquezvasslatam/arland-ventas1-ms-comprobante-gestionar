package pe.com.arland.ventas1.ms.comprobante.main;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = {GestionarApplication.class})
@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
public class GestionarApplicationTest {

	@Test
	public void contextLoad() {
		
	}
}
