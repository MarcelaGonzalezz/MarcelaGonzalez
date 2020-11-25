package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	Integer numeroDeInscripcion;
	
	public Club(String nombre) {
		this.nombre= nombre;
		this.competencias= new LinkedHashMap<String, Evento>();
		this.socios= new TreeSet<Deportista>();
		this.numeroDeInscripcion=0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Deportista> getSocios() {
		return socios;
	}

	public void setSocios(Set<Deportista> socios) {
		this.socios = socios;
	}

	public Map<String, Evento> getCompetencias() {
		return competencias;
	}

	public void setCompetencias(Map<String, Evento> competencias) {
		this.competencias = competencias;
	}

	public Integer getNumeroDeInscripcion() {
		return numeroDeInscripcion;
	}

	public void setNumeroDeInscripcion(Integer numeroDeInscripcion) {
		this.numeroDeInscripcion = numeroDeInscripcion;
	}

	public void agregarDeportista(Deportista deportistaNuevo) {
		socios.add(deportistaNuevo);
	}

	public void crearEvento(TipoDeEvento tipo, String nombre) {
		for (Deportista deportista : socios) {
			if (deportista.getNombre().equals(nombre)) {
				Evento e= new Evento(tipo);
				competencias.put(nombre, e);
			}
		}
		
	}
 
	public Integer inscribirEnEvento(String nombreDelEvento, Deportista deportista) throws NoEstaPreparado{
		for (Deportista depo : socios) {
			if(depo.getNumeroDeSocio().equals(deportista.getNumeroDeSocio())) {
				if (depo instanceof Corredor) {
						numeroDeInscripcion++;
						return getNumeroDeInscripcion();
					}else {
						throw new NoEstaPreparado("El deportista no esta preparado");
					}
			}
		}

		return numeroDeInscripcion;
	}
}
