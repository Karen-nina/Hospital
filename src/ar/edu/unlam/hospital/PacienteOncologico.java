package ar.edu.unlam.hospital;

public class PacienteOncologico extends Paciente {

	private boolean puedeComerAlimentosCrudos;

	public PacienteOncologico(Integer id, String nombre, String diagnostico) {
		super(id, nombre, diagnostico);
		this.puedeComerAlimentosCrudos = false;
	}
	
	
}
