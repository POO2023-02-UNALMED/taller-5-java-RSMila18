package gestion;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private Zona zonas;
	
	public Zoologico(String name, String ubicacion, Zona zones) {
		this.nombre = name;
		this.ubicacion = ubicacion;
		this.zonas = zones;
		
	}
	public void agregarZonas(Zona zones) {
		this.zonas = zones;
	}

}
