package com.dca.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaAlumnosControlador {
	
	// Método que proporciona el formulario
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() {
		return "HolaAlumnosFormulario";
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		return "HolaAlumnosSpring";
	}
	
	@RequestMapping("/procesarFormulario2")
	public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {
		String nombre = request.getParameter("nombreAlumno");
		
		nombre += " es el mejor alumno";
		
		String mensaje = "¿Quién es el mejor alumno? " + nombre;
		
		// Agregando info al modelo
		modelo.addAttribute("mensajeClaro", mensaje);
		
		return "HolaAlumnosSpring";
	}
}
