package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{

	public static final String plural = "Aves";
	private static ArrayList<Ave>
	listado = new ArrayList<Ave>();
	public static int halcones = 0;
	public static int aguilas = 0;
	private String colorPlumas;
	
	private Ave() {
		this(null,0,null,null,null);
	}
	
	public Ave(String name, int age, String habitat, String gender, String skin) {
		super(name,age,habitat,gender);
		this.colorPlumas = skin;
		Ave.listado.add(this);
	}
	
	public static int cantidadAves(){
		return Ave.listado.size();
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public static ArrayList<Ave> getListado() {
        return listado;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public static void setListado(ArrayList<Ave> listado) {
        Ave.listado = listado;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public static Ave crearHalcon(String name, int age, String gender) {
        Ave.halcones++;
        return new Ave(name, age, "montanas", gender, "cafe glorioso");
    }
    
    public static Ave crearAguila(String name, int age, String gender) {
    	Ave.aguilas++;
    	return new Ave(name, age, "montanas", gender, "blanco y amarillo");
    }
}