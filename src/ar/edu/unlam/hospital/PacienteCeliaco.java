package ar.edu.unlam.hospital;

public class PacienteCeliaco extends Paciente {

	private boolean puedeComerAlimentosConGluten;

	public PacienteCeliaco(Integer id, String nombre, String diagnostico) {
		super(id, nombre, diagnostico);
		this.puedeComerAlimentosConGluten = false;
	}
	
	


}
