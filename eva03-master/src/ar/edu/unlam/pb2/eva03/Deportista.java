package ar.edu.unlam.pb2.eva03;

public class Deportista {
	
	private String nombre;
	private Integer numeroDeSocio;

	public Deportista(Integer numeroDeSocio, String nombre) {
		this.numeroDeSocio= numeroDeSocio;
		this.nombre= nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNumeroDeSocio() {
		return numeroDeSocio;
	}

	public void setNumeroDeSocio(Integer numeroDeSocio) {
		this.numeroDeSocio = numeroDeSocio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((numeroDeSocio == null) ? 0 : numeroDeSocio.hashCode());
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
		Deportista other = (Deportista) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numeroDeSocio == null) {
			if (other.numeroDeSocio != null)
				return false;
		} else if (!numeroDeSocio.equals(other.numeroDeSocio))
			return false;
		return true;
	}
	
}
