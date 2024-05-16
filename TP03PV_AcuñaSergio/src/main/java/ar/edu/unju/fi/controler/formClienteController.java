package ar.edu.unju.fi.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class formClienteController {
	
	@GetMapping("/formulario")
	public String getFormCliente() {
		return "formCliente";
	}
	
}
