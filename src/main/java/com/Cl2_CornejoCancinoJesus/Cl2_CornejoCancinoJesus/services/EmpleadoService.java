package com.Cl2_CornejoCancinoJesus.Cl2_CornejoCancinoJesus.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Cl2_CornejoCancinoJesus.Cl2_CornejoCancinoJesus.models.Empleado;
import com.Cl2_CornejoCancinoJesus.Cl2_CornejoCancinoJesus.repositories.IEmpleadoRepository;

@Service
public class EmpleadoService {

	@Autowired
	private IEmpleadoRepository EmpleadoRepository;
	
	public List<Empleado> buscarPorNombre(String nombre){
		return EmpleadoRepository.findByNombre(nombre);
	}
	
	public List<Empleado> buscarTodos(){
		return EmpleadoRepository.findAll();
	}
	
	public Empleado getOneEmpleado(Long id) {
		Optional<Empleado> personalResult = EmpleadoRepository.findById(id);
		return personalResult.isPresent()? personalResult.get(): null;
	}
	
	public Empleado guardarPersonal(Empleado Empleado) {
		return EmpleadoRepository.save(Empleado);
	}
}
