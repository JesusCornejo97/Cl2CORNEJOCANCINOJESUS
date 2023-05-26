package com.Cl2_CornejoCancinoJesus.Cl2_CornejoCancinoJesus.controllers;

import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Cl2_CornejoCancinoJesus.Cl2_CornejoCancinoJesus.models.Empleado;
import com.Cl2_CornejoCancinoJesus.Cl2_CornejoCancinoJesus.services.EmpleadoService;

import lombok.extern.java.Log;

@Controller
@RequestMapping("/home")
public class IndexController {
	
protected final Log logger = LogFactory.getLog(this.getClass());
	
	@Autowired
	private EmpleadoService EmpleadoService;
	
	@GetMapping({"/index", "/", "", "/home"})
	public String index(Model model) {
		String title = "Hello World!";
		model.addAttribute("titulo",title);
		Empleado EmpleadoObj = this.EmpleadoService.getOneEmpleado(1L);
		
		model.addAttribute("Empleado",EmpleadoObj);
		
		logger.info("Objecto recuperado con exito!");
		return "index";		
	}

}
