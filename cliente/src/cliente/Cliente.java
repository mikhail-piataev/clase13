package cliente;

import javax.swing.JOptionPane;

public class Cliente extends Usuario {
	int nroCuenta;

	public Cliente(String nombre, String dni, String rol, String pin, int nroCuenta) {
		super(nombre, dni, rol, pin);
		this.nroCuenta = nroCuenta;
	}

	public int getNroCuenta() {
		return nroCuenta;
	}

	public void setNroCuenta(int nroCuenta) {
		this.nroCuenta = nroCuenta;
	}
	@Override
	public void menu() {
		JOptionPane.showMessageDialog(null, "Bienvenido cliente");
	}
	public boolean retirarDinero() {
		JOptionPane.showMessageDialog(null, "Retirar dinero");
		return false;
	}
	public boolean depositarDinero() {
		JOptionPane.showMessageDialog(null, "Depositar dinero");
		return false;
	}
	

}
