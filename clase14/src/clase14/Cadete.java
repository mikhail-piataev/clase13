package clase14;

public class Cadete extends Empleado {
	private String zona;

	public Cadete(String nombre, double sueldo, String zona) {
		super(nombre, sueldo);
		this.zona = zona;
	}

	@Override
	public String toString() {
		return "Cadete [zona=" + zona + ", toString()=" + super.toString() + ", getNombre()=" + getNombre()
				+ ", getSueldo()=" + getSueldo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


}
