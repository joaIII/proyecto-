package proyecto;

public class Cliente {
	private int  CodCliente;
	private String Nombre;
	private String Apellido;
	private int dni;
	private int celular;
	private int estado;
	
	public Cliente(int codCliente, String nombre, String apellido, int dni, int celular, int estado) {
		CodCliente = codCliente;
		Nombre = nombre;
		Apellido = apellido;
		this.dni = dni;
		this.celular = celular;
		this.estado = estado;
	}

	public int getCodCliente() {
		return CodCliente;
	}

	public void setCodCliente(int codCliente) {
		CodCliente = codCliente;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public int getEstado() {
		return estado;
	}

	/*public void setEstado(int estado) {
		this.estado = estado;
	}
	*/
	 public void setEstado(int estado) {
	        if (estado >= 0 && estado <= 2) {
	            this.estado = estado;
	        } else {
	            System.out.println("Estado no válido. No se ha realizado el cambio.");
	        }
	 }

	
	
	/*
	public String Estado() {
		if (estado == 0) {
			return "registrado";
		}
		else if (estado == 1) {
			return "proceso";
		}
		else if (estado == 2){
			return "entregado";
		}
		else {
			return "Estado no válido";
		}
		
	}
	*/
		

	
}
