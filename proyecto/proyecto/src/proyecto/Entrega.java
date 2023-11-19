package proyecto;

public class Entrega {
	
	Cliente C = new Cliente();
	Artefacto A = new Artefacto();
	
	private int numEntrega;
	private String fecha;
	private String hora;
	public Entrega(int numEntrega, String fecha, String hora) {
		this.numEntrega = numEntrega;
		this.fecha = fecha;
		this.hora = hora;
	}
	
	public int getNumEntrega() {
		return numEntrega;
	}
	public void setNumEntrega(int numEntrega) {
		this.numEntrega = numEntrega;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public int CodCliente() {
		return C.getCodCliente();
		}
	public int codArtefacto() {
		return A.getCodArtefacto();
	}

}
