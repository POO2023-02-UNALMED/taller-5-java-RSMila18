package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{

	public static int iguanas;
	public static int serpientes;
	private final static ArrayList<Reptil> 
	listado = new ArrayList<>();
	private String colorEscamas;
    private int largoCola;

    public Reptil(String name, int age, String habitat, String gender, String skin, int tail) {
        super(name, age, habitat, gender);
        this.colorEscamas = skin;
        this.largoCola = tail;
        listado.add(this);
    }

    public Reptil() {
        listado.add(this);
    }

    public static int cantidadReptiles() {
        return listado.size();
    }

    @Override
    public String movimiento() {
        return "reptar";
    }

    public static Reptil crearIguana(String name, int age, String gender) {
        iguanas++;
        Reptil iguana = new Reptil(name, age, "humedal", gender, "verde", 3);
        listado.add(iguana);
        return iguana;
    }

    public static Reptil crearSerpiente(String name, int age, String gender) {
        serpientes++;
        Reptil serpiente = new Reptil(name, age, "jungla", gender, "blanco", 1);
        listado.add(serpiente);
        return serpiente;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }
    
    public int getLargoCola() {
    	return largoCola;
    }
}
