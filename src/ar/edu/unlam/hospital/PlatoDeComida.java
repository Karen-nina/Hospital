package ar.edu.unlam.hospital;

import java.util.HashSet;

public class PlatoDeComida {
	
	private Integer idComida;
	private String nombre;
	private FormaDeCoccion tipo;
	private HashSet<Ingrediente> ingredientes;
	
	public PlatoDeComida(Integer id, String nombre, FormaDeCoccion tipo, HashSet<Ingrediente> ingredientes) {
		this.idComida = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.ingredientes = ingredientes;
	}

	public Integer getId() {
		return idComida;
	}

	public void setId(Integer id) {
		this.idComida = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public FormaDeCoccion getTipo() {
		return tipo;
	}

	public void setTipo(FormaDeCoccion tipo) {
		this.tipo = tipo;
	}

	public HashSet<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(HashSet<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idComida == null) ? 0 : idComida.hashCode());
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
		PlatoDeComida other = (PlatoDeComida) obj;
		if (idComida == null) {
			if (other.idComida != null)
				return false;
		} else if (!idComida.equals(other.idComida))
			return false;
		return true;
	}
	
	


	
	

}
