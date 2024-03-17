package pe.edu.tecsup._04.collections.list.ejercicios;

import java.util.Objects;

public class Auto {

	private String modelo;
	
	private String marca;

	public Auto(String modelo, String marca) {
		super();
		this.modelo = modelo;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Auto [modelo=" + modelo + ", marca=" + marca + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, modelo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo);
	}

	
	
}
