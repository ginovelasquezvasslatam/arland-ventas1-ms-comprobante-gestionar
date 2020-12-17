package pe.com.arland.ventas1.ms.comprobante.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import pe.com.arland.cliente1.registro.component.MessageComponent;

@ExtendWith(SpringExtension.class)
//serviciosInternos
@ContextConfiguration(classes = {GestionarApplication.class})
//servicioRest
//@SpringBootTest
public class SimpleSpringTest {
	
	@Autowired
	public MessageComponent messageComponent;
	
	@Test
	public void test() {
		assertEquals("Hello world!", messageComponent.getMessage());
	}

}
