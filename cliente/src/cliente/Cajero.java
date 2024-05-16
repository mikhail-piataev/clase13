package cliente;

import javax.swing.JOptionPane;

public class Cajero extends Usuario{
	double saldo;

	public Cajero(String nombre, String dni, String rol, String pin, double saldo) {
		super(nombre, dni, rol, pin);
		this.saldo = saldo;
	}
	@Override
	public void menu() {
		JOptionPane.showMessageDialog(null, "Bienvenido, cajero");
	}


}
