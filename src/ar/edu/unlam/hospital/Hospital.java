package ar.edu.unlam.hospital;

import java.util.HashSet;

public class Hospital {
	
	 String nombre; 
	 HashSet<Paciente> generales;
	 HashSet<PacienteDiabetico> diabeticos;
	 HashSet<PacienteOncologico> oncologicos;
	 HashSet<PacienteHipertenso> hipertensos;
	 HashSet<PacienteCeliaco> celiacos;
	 HashSet<PlatoDeComida> listaDePlatos;
	
	
	public Hospital() {
		generales = new HashSet<>();
		diabeticos = new HashSet<>();
		oncologicos = new HashSet<>();
		hipertensos = new HashSet<>();
		celiacos = new HashSet<>();
		listaDePlatos = new HashSet<>();
		comidas = new HashSet<>();
	}

	public void agregarPaciente(Paciente paciente) {
		generales.add(paciente);	
	}
	
	public void agregarPacienteD(PacienteDiabetico paciente) {
		diabeticos.add(paciente);	
	}

	public void agregarPacienteO(PacienteOncologico paciente) {
		oncologicos.add(paciente);	
	}

	public void agregarPacienteH(PacienteHipertenso paciente) {
		hipertensos.add(paciente);	
	}

	public void agregarPacienteC(PacienteCeliaco paciente) {
		celiacos.add(paciente);	
	}

	public void agregarPlato(PlatoDeComida plato) {
		listaDePlatos.add(plato);	
		
	}

	public void asignarPlato(Paciente paciente, PlatoDeComida plato) {
		Comida comida = new Comida(plato, paciente);
		comidas.add(comida);
	}

	public PlatoDeComida buscarPlatoDelPaciente(Integer idPaciente) {
		for(Comida comida: comidas) {
			if(comida.getPaciente().getId() == idPaciente) {
				return comida.getPlato();
			}
		}
		return null;
	}

}
