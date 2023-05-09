package ar.edu.unlam.hospital;

public class Paciente {
	
	protected Integer idPaciente;
	protected String nombre;
	protected String diagnostico;
	protected PlatoDeComida platoDeComida;
	
	
	public Paciente(Integer id, String nombre, String diagnostico) {
		this.idPaciente = id;
		this.nombre = nombre;
		this.diagnostico = diagnostico;
		this.platoDeComida = null;
	}

	public PlatoDeComida getComida() {
		return platoDeComida;
	}

	public void setPlatoDeComida(PlatoDeComida comida) {
		this.platoDeComida = comida;
	}

	public Integer getId() {
		return idPaciente;
	}

	public void setId(Integer id) {
		this.idPaciente = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPaciente == null) ? 0 : idPaciente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (idPaciente == null) {
			if (other.idPaciente != null)
				return false;
		} else if (!idPaciente.equals(other.idPaciente))
			return false;
		return true;
	}


}
