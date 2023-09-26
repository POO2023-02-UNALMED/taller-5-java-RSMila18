package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal{

	public static int salmones;
	
	public static int bacalaos;
    private final static ArrayList<Pez> 
    listado = new ArrayList<>();

    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String name, int age, String habitat, String gender, String skin, int fins) {
        super(name, age, habitat, gender);
        this.colorEscamas = skin;
        this.cantidadAletas = fins;
        listado.add(this);
    }

    public Pez() {
        listado.add(this);
    }

    public static int cantidadPeces() {
        return listado.size();
    }

    @Override
    public String movimiento() {
        return "nadar";
    }

    public static Pez crearSalmon(String name, int age, String gender) {
        salmones++;
        Pez salmon = new Pez(name, age, "oceano", gender, "rojo", 6);
        listado.add(salmon);
        return salmon;
    }

    public static Pez crearBacalao(String name, int age, String gender) {
        bacalaos++;
        Pez bacalao = new Pez(name, age, "oceano", gender, "gris", 6);
        listado.add(bacalao);
        return bacalao;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }
    
    public int getCantidadAletas() {
    	return cantidadAletas;
    }
}
