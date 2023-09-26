package gestion;
import java.util.ArrayList;

public class Zoologico {

	private Sting nombre;
	private String ubicacion;
	private ArrayLis<Zona>
	zonas = new ArrayList<>();
		
	public Zoologico() {
		this(null,null);
	}
	
	public Zoologico(String name, String ubi) {
		this.nombre = name;
		this.ubicacion = ubi;
	}
	
	public void agregarZonas(Zona zone) {
		this.zonas.add(zona);
		zone.setZoo(this);
	}
	
	public int cantidadTotalAnimales() {
		int count = 0;
		for (int i = 0; i < zonas.size(); i++) {
			count +=
			this.zonas.get(i).cantidadAnimales();
		}
		return count;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public ArrayList<Zona> getZona(){
		return zonas;
	}
	
	public void setNombre(String name) {
		this.nombre = name;
	}
	
	public void setUbicacion(String ubi) {
		this.ubicacion = ubi;
	}
	
	public void setZona(ArrayList<Zona>zone) {
		this.zonas = zone;
	}
}
