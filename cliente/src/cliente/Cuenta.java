package cliente;

public class Cuenta {
	private int nroCliente;
	private double saldo;
	private Cliente cliente;
	private String operacionrs;
	public Cuenta(int nroCliente, double saldo, Cliente cliente, String operacionrs) {
		super();
		this.nroCliente = nroCliente;
		this.saldo = saldo;
		this.cliente = cliente;
		this.operacionrs = operacionrs;
	}
	public int getNroCliente() {
		return nroCliente;
	}
	public void setNroCliente(int nroCliente) {
		this.nroCliente = nroCliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getOperacionrs() {
		return operacionrs;
	}
	public void setOperacionrs(String operacionrs) {
		this.operacionrs = operacionrs;
	}
	
}
