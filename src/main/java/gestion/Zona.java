package gestion;
import java.util.ArrayList;
import zooAnimales.Animal

public class Zona {
	
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal>
	animales = new ArrayList<>();
	
	public Zona(String name, Zoologico zoo) {
		this.nombre = name;
		this.zoo = zoo;
	}
	
	public Zona() {
		this(null,null);
	}
	
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	
	public String getnombre() {
		return nombre;
	}
	
	public void setNombre(String name) {
		this.nombre = name;
	}
	
	public Zoologico getZoo() {
		return zoo;
	}
	
	public void setZoo(String zoo) {
		this.zoo = zoo;
	}
}
