package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal{

	public static int caballos;
	public static int leones;
    private final static ArrayList<Mamifero> 
    listado = new ArrayList<>();
    private boolean pelaje;
    private int patas;

    public Mamifero(String name, int age, String habitat, String gender, boolean fur, int paws) {
        super(name, age, habitat, gender);
        this.pelaje = fur;
        this.patas = paws;
        listado.add(this);
    }

    public Mamifero() {
        listado.add(this);
    }

    public static int cantidadMamiferos() {
        return listado.size();
    }

    public static Mamifero crearCaballo(String name, int age, String gender) {
        caballos++;
        Mamifero caballo = new Mamifero(name, age, "pradera", gender, true, 4);
        listado.add(caballo);
        return caballo;
    }
    public static Mamifero crearLeon(String name, int age, String gender) {
        leones++;
        Mamifero leon = new Mamifero(name, age, "selva", gender, true, 4);
        listado.add(leon);
        return leon;
    }

    public boolean isPelaje() {
        return pelaje;
    }
    
    public int getPatas() {
    	return patas;
    }
}
