package ar.edu.unlam.hospital;

public class PacienteCeliaco extends Paciente {

	private boolean puedeComerAlimentosConGluten;

	public PacienteCeliaco(Integer id, String nombre, String diagnostico) {
		super(id, nombre, diagnostico);
		this.puedeComerAlimentosConGluten = false;
	}

	public boolean isPuedeComerAlimentosConGluten() {
		return puedeComerAlimentosConGluten;
	}

	public void setPuedeComerAlimentosConGluten(boolean puedeComerAlimentosConGluten) {
		this.puedeComerAlimentosConGluten = puedeComerAlimentosConGluten;
	}
	
	


}
