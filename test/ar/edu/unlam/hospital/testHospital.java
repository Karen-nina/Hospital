package ar.edu.unlam.hospital;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;

public class testHospital {

	@Test
	public void queSePuedaAgregarPacienteAHospital() {
		Hospital hospital;
		Paciente paciente;
		
		String nombreH = "Duran";
		String nombreP = "Rocio";
		Integer idPaciente = 1;
		String dx = "infeccion";
		
		hospital = new Hospital(nombreH);
		paciente = new Paciente(idPaciente,nombreP, dx);
		
		hospital.agregarPaciente(paciente);
		
		assertFalse(hospital.generales.isEmpty());
	}
	
	@Test
	public void queSePuedaAgregarPlatoAHospital() {
		Hospital hospital;
		String nombreH = "Duran";
		
		PlatoDeComida plato;
		Integer idC = 1;
		String nombreC = "Fideos con tuco";
		FormaDeCoccion tipo = FormaDeCoccion.HORNO;
		HashSet<Ingrediente> ingredientes = new HashSet<>();
		
		ingredientes.add(Ingrediente.FRUTAS);
		
		hospital = new Hospital(nombreH);
		plato = new PlatoDeComida(idC,nombreH ,tipo ,ingredientes);
		
		hospital.agregarPlatoDeComida(plato);
		
		assertFalse(hospital.listaDePlatos.isEmpty());
	}
	
	
	@Test
	public void queSePuedaAsignarPlatoAPacienteGeneral() {
		Hospital hospital;
		String nombreH = "Duran";
		
		PlatoDeComida plato;
		Integer idC = 1;
		String nombreC = "Fideos con tuco";
		FormaDeCoccion tipo = FormaDeCoccion.HORNO;
		HashSet<Ingrediente> ingredientes = new HashSet<>();
		
		ingredientes.add(Ingrediente.FRUTAS);
		
		hospital = new Hospital(nombreH);
		plato = new PlatoDeComida(idC,nombreH ,tipo ,ingredientes);
		
		hospital.agregarPlatoDeComida(plato);
		
		Paciente paciente;
		String nombreP = "Rocio";
		Integer idPaciente = 1;
		String dx = "infeccion";
	
		paciente = new Paciente(idPaciente,nombreP, dx);
		
		hospital.agregarPaciente(paciente);
		
		hospital.asignarPlatoaPacienteGeneral(paciente, plato);
		
		assertEquals(plato , hospital.buscarPacientePorId(idPaciente).getComida());
	}

}
