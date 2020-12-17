package pe.com.arland.ventas1.ms.comprobante.ws.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pe.com.arland.cliente1.registro.entity.FacturaEntity;
import pe.com.arland.cliente1.registro.entity.ItemComprobanteEntity;
import pe.com.arland.ventas1.ms.comprobante.main.FacturaRepository;

@Controller
public class ComprobanteController {
	  private static final String template = "Hola Mundo, %s!";
	  private final AtomicLong counter = new AtomicLong();

	  @Autowired
	  FacturaRepository facturaRepository;
	  
	  @GetMapping("/hola-Mundo")
	  @ResponseBody
	  public Saludo sayHello(
	  @RequestParam(name="name", required=false, defaultValue="Desconocido") 
	  String name) {
	    return new Saludo(counter.incrementAndGet(), String.format(template, name));
	  }
	  
	  @GetMapping("/comprobantePago")
	  @ResponseBody
	  public List<FacturaEntity> listarFacturas() {
		  return facturaRepository.findAll();
	  }
	  
	  //REGISTRANDO --
	  @GetMapping("/comprobantePago/e/registrarFacturas")
	  @ResponseBody
	  String registrarFacturas() {
		  try {
			  List<ItemComprobanteEntity> lst = new ArrayList<>();
			  ItemComprobanteEntity item = new ItemComprobanteEntity(1000, "P0001", "Item1", 20d, 24.5d, 50.0d);
			  lst.add(item);	
			  
			  facturaRepository.save(
			  new FacturaEntity("20100010202","01","0020",
						(long) 345 , 14850.0 , "CLI0002" , "EMP0023" , new Date(),
						new Date() ,"01" ,lst,  14850*0.18,
						"22039393949"));
			  
			  facturaRepository.save(
			  new FacturaEntity("20100010202","01","0020",
						(long) 346 , 14850.0 , "CLI0002" , "EMP0001" , new Date(),
						new Date() ,"01" ,lst,  14850*0.18,
						"10299293999"));

			 
			  /*
			  facturaRepository.save(
			  new FacturaEntity("20100010202","01","0020",
						(long) 345 , 14850.0 , "CLI0002" , "EMP0023" , new Date(),
						new Date() ,"01" ,  14850*0.18,
						"22039393949"));
			  
			  facturaRepository.save(
			  new FacturaEntity("20100010202","01","0020",
						(long) 346 , 14850.0 , "CLI0002" , "EMP0001" , new Date(),
						new Date() ,"01" ,  14850*0.18,
						"10299293999"));
			  facturaRepository.save(
			  new FacturaEntity("20100010202","01","0020",
						(long) 347 , 14850.0 , "CLI0002" , "EMP0002" , new Date(),
						new Date() ,"01" ,  14850*0.18,
						"10928374636"));
			  facturaRepository.save(
			  new FacturaEntity("20100010202","01","0020",
						(long) 348 , 14850.0 , "CLI0002" , "EMP0004" , new Date(),
						new Date() ,"01" ,  14850*0.18,
						"11992837373"));
			  //--------------------------
			  facturaRepository.save(
			  new FacturaEntity("20100010202","01","0021",
						(long) 349 , 34555.0 , "CLI0023" , "EMP0033" , new Date(),
						new Date() ,"01" ,  14850*0.18,
						"22039393949"));
			  
			  facturaRepository.save(
			  new FacturaEntity("20100010202","01","0021",
						(long) 377 , 23344.0 , "CLI0023" , "EMP0011" , new Date(),
						new Date() ,"01" ,  23344*0.18,
						"10928374636"));
			  
			  facturaRepository.save(
			  new FacturaEntity("20100010202","01","0021",
						(long) 350 , 23344.0 , "CLI0012" , "EMP0023" , new Date(),
						new Date() ,"01" ,  23344*0.18,
						"10928374636"));
			  
			  facturaRepository.save(
			  new FacturaEntity("20100010202","01","0021",
						(long) 351 , 14850.0 , "CLI0012" , "EMP0004" , new Date(),
						new Date() ,"01" ,  14850*0.18,
						"11992837373"));
			  */
		} catch (Exception e) {
			String strErr = e.getMessage();
			return e.getMessage();
		}
	    return "Completado con exito";
	  }
	  
	  @PostMapping("/comprobantePago/e/registrarFactura")
	  @ResponseBody
	  String registrarFactura(@RequestBody FacturaEntity facturaEntity) {
		  facturaRepository.save(facturaEntity);
		  return "ok";
	  }
	  
	  @DeleteMapping("/comprobantePago/e/eliminarFacturas")
	  @ResponseBody
	  String eliminarFacturas() {
		  facturaRepository.deleteAll();
		  return "ok";
	  }
}
