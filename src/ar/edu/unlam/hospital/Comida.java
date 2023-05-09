package ar.edu.unlam.hospital;

public class Comida {

	public PlatoDeComida plato;
	public Paciente paciente;
	
	public Comida (PlatoDeComida plato, Paciente paciente) {
		this.plato = plato;
		this.paciente = paciente;
	}

	public PlatoDeComida getPlato() {
		return plato;
	}

	public void setPlato(PlatoDeComida plato) {
		this.plato = plato;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
}

