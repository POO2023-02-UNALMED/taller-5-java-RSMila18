package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal{
	
	public static int ranas;
	public static int salamandras;
	private final static ArrayList<Anfibio>
	listado = new ArrayList();
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String name, int age, String habitat, String gender, String skin, boolean poison) {
		super(name,age,habitat,gender);
		this.colorPiel = skin;
		this.venenoso = poison;
		listado.add(this);
	}
	
	public Anfibio() {
		listado.add(this);
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "saltar";
	}
	
	public static Anfibio crearRana(String name, int age, String gender) {
		ranas++;
		Anfibio rana = new Anfibio(name, age, "selva", gender, "rojo", true);
		listado.add(rana);
		return rana;
	}
	
	public static Anfibio crearSalamandra(String name, int age, String gender) {
		salamandras++;
		Anfibio salamandra = new Anfibio(name, age, "selva", gender, "negro y amarillo", false);
		listado.add(salamandra);
		return salamandra;
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	
	public boolean isVenenoso() {
		return venenoso;
	}
}
