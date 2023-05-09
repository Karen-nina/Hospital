package ar.edu.unlam.hospital;

public class PacienteDiabetico extends Paciente {

	private boolean puedeComerAzucar;

	public PacienteDiabetico(Integer id, String nombre, String diagnostico) {
		super(id, nombre, diagnostico);
		
		this.puedeComerAzucar = false;
	}
	
	
	

}
