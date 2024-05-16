package cliente;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cajero corrientes = new Cajero("El cajero","1213 ", "sdfdas","sdfds", 100);
		Cliente unCliente = new Cliente("El cliente","13425890", "qwer","reer", 10); 
		unCliente.menu();
		corrientes.menu();
	}

}
