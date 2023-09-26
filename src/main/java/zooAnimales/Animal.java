package zooAnimales;
import gestion.Zona;

public class Animal {
	
	private static int totalAnimales;
	private SString nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal(String name, int age, String habitat, String gender) {
		this.nombre = name;
		this.edad = age;
		this.habitat = habitat;
		this.genero = gender;
		totalAnimales++;
	}
	
	public Animal() {
		totalAnimales++;
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public static String totalPorTipo() {
		return "Mamiferos: " + Mamifero.cantidadMamimefros() + "\n" + 
				"Aves: " + Ave.cantidadAves() + "\n" +
				"Reptiles: " + Reptil.cantidadReptiles() + "\n" +
				"Peces: " + Pez.cantidadPeces() + "\n" +
				"Anfibios: " + Anfibio.cantidadAnfibios();
	}
	
	@Override
	public String toString() {
		if )zona == null) {
			return String.format("Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero es %s", nombre, edad, habitat, genero);
		}
		else {
			return String.format("Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero es %s, la zona en la que me ubico es %s, en el %s", nombre, edad, habitat, genero, zona, zona.getZoo().getNombre());
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public String getGenero() {
		return genero;
	}
}
