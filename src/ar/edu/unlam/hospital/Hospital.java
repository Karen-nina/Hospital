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
	
	public Hospital(String nombre) {
		generales = new HashSet<>();
		diabeticos = new HashSet<>();
		oncologicos = new HashSet<>();
		hipertensos = new HashSet<>();
		celiacos = new HashSet<>();
		listaDePlatos = new HashSet<>();
		this.nombre = nombre;

	}
	public void agregarPaciente(Paciente paciente) {
		this.generales.add(paciente);
		
	}
	public void agregarPlatoDeComida(PlatoDeComida plato) {
		this.listaDePlatos.add(plato);
		
	}
	public Paciente buscarPacientePorId(Integer idPaciente) {
		for (Paciente paciente: generales) {
			if (paciente.getId().equals(idPaciente)) {
				return paciente;
			}
		} 
		return null;
	}
		
	public PlatoDeComida buscarComidaPorId(Integer idComida) {
		for ( PlatoDeComida comida : listaDePlatos) {
			if (comida.getId().equals(idComida)) {
				return comida;
			}
		} 
		return null;
	}
		
	public boolean asignarPlatoaPacienteGeneral(Paciente paciente, PlatoDeComida comida) {
		if (paciente.getComida() == null) {
			paciente.setPlatoDeComida(comida);
			return true;
		}
		return false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashSet<Paciente> getGenerales() {
		return generales;
	}

	public void setGenerales(HashSet<Paciente> generales) {
		this.generales = generales;
	}

	public HashSet<PacienteDiabetico> getDiabeticos() {
		return diabeticos;
	}

	public void setDiabeticos(HashSet<PacienteDiabetico> diabeticos) {
		this.diabeticos = diabeticos;
	}

	public HashSet<PacienteOncologico> getOncologicos() {
		return oncologicos;
	}

	public void setOncologicos(HashSet<PacienteOncologico> oncologicos) {
		this.oncologicos = oncologicos;
	}

	public HashSet<PacienteHipertenso> getHipertensos() {
		return hipertensos;
	}

	public void setHipertensos(HashSet<PacienteHipertenso> hipertensos) {
		this.hipertensos = hipertensos;
	}

	public HashSet<PacienteCeliaco> getCeliacos() {
		return celiacos;
	}

	public void setCeliacos(HashSet<PacienteCeliaco> celiacos) {
		this.celiacos = celiacos;
	}

	public HashSet<PlatoDeComida> getListaDePlatos() {
		return listaDePlatos;
	}

	public void setListaDePlatos(HashSet<PlatoDeComida> listaDePlatos) {
		this.listaDePlatos = listaDePlatos;
	}
	

}
