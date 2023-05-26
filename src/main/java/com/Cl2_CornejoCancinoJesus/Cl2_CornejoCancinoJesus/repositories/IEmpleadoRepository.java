package com.Cl2_CornejoCancinoJesus.Cl2_CornejoCancinoJesus.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Cl2_CornejoCancinoJesus.Cl2_CornejoCancinoJesus.models.Empleado;


@Repository
public interface IEmpleadoRepository extends JpaRepository<Empleado,Long>{

	public List<Empleado> findAll();
	List<Empleado> findByNombre(String nombre);
}
