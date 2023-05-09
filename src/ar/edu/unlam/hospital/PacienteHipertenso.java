package ar.edu.unlam.hospital;

public class PacienteHipertenso extends Paciente {

	private boolean puedeComerSal;

	public PacienteHipertenso(Integer id, String nombre, String diagnostico) {
		super(id, nombre, diagnostico);
		this.puedeComerSal = false;
	}
	
	
	
}
