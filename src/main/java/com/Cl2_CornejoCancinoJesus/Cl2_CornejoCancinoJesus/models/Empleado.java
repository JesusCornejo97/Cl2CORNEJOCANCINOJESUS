package com.Cl2_CornejoCancinoJesus.Cl2_CornejoCancinoJesus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Empleado")
public class Empleado implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Codigo_Trabajador")
	Long id;
	
	@Column(name = "Empleado_nombre")
	String nombre;
	
	@Column(name = "Sueldo")
	String sueldo;
	
	@Column(name = "Codigo_Area")
	String codigo;
	
	

}
