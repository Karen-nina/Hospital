package ar.edu.unlam.hospital;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;

public class testHospital {

	@Test
	public void agregarPaciente() {
		Hospital h = null;
		Paciente paciente;
		
		String nombre = "Rocio";
		Integer id = 1;
		
		h = new Hospital();
		paciente = new Paciente(id,nombre);
		
		h.agregarPaciente(paciente);
		
		assertFalse(h.generales.isEmpty());
	}
	
	@Test
	public void agregarPlato() {
		Hospital h = null;
		PlatoDeComida plato;
		
		String nombre = "Fideos con tuco";
		Integer id = 1;
		FormaDeCoccion tipo = FormaDeCoccion.HORNO;
		HashSet<Ingrediente> ingredientes = new HashSet<>();
		
		ingredientes.add(Ingrediente.SAL);
		
		h = new Hospital();
		plato = new PlatoDeComida(id,nombre,tipo,ingredientes);
		
		h.agregarPlato(plato);
		
		assertFalse(h.menu.isEmpty());
	}
	
	@Test
	public void agregarPeswaciente() {
		Hospital h = null;
		Paciente paciente;
		
		String nombre = "Rocio";
		Integer id = 1;
		
		h = new Hospital();
		paciente = new Paciente(id,nombre);
		
		h.agregarPaciente(paciente);
		
		assertFalse(h.generales.isEmpty());
	}
	
	@Test
	public void asignarPlatoAPacienteGeneral() {
		Hospital h;
		PlatoDeComida plato;
		Paciente paciente;
		
		String nombre = "Matias";
		Integer id = 1;
		String nombrePlato = "Milanesas con ensalada";
		Integer idPlato = 1;
		
		h = new Hospital();
		paciente = new Paciente(id,nombre);
		FormaDeCoccion tipoCoccion = FormaDeCoccion.HORNO;
		HashSet<Ingrediente> ingredientes = new HashSet<>();
		ingredientes.add(Ingrediente.SAL);
		ingredientes.add(Ingrediente.VERDURAS);
		plato = new PlatoDeComida(idPlato,nombrePlato,tipoCoccion,ingredientes);
		h.agregarPlato(plato);
		
		h.asignarPlato(paciente, plato);
		assertEquals(plato , h.buscarPlatoDelPaciente(id));
	}

}
