package py.edu.facitec.taller4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//indica a spring que se trata de una clase que gestionara las peticiones y respuestas de la pagina
@Controller

public class HomeController {
	//lo que se escribe en el navegador
	@RequestMapping("/")
public String index(){
	//para saber si ingreso a la peticion "/"
	System.out.println("cargue la página");
	//pagina a responder 
	return "pagina_home";
}
}
