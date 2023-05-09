package ar.edu.unlam.hospital;

import java.util.HashSet;

public class PlatoDeComida {
	
	private Integer id;
	private String nombre;
	private FormaDeCoccion tipo;
	private HashSet<Ingrediente> ingredientes;
	
	public PlatoDeComida(Integer id, String nombre, FormaDeCoccion tipo, HashSet<Ingrediente> ingredientes) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.ingredientes = ingredientes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	


	
	

}
