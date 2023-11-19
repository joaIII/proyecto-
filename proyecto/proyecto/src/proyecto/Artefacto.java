package proyecto;

public class Artefacto {
    
	private int codArtefacto;
    private String falla;
    private int tipo; 
    private int marca; 

    public Artefacto(int codArtefacto, String falla, int tipo, int marca) {
    	this.setCodArtefacto(codArtefacto);
        this.falla = falla;
        this.tipo = tipo;
        this.marca = marca;
    }

    public int getCodArtefacto() {
		return codArtefacto;
	}

	public void setCodArtefacto(int codArtefacto) {
		this.codArtefacto = codArtefacto;
	}
    public String getFalla() {
        return falla;
    }

    public void setFalla(String falla) {
        this.falla = falla;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    private String obtenerNombreTipo() {
        switch (tipo) {
            case 0:
                return "TV";
            case 1:
                return "Microondas";
            case 2:
                return "Licuadora";
            case 3:
                return "Plancha";
            case 4:
                return "Hervidora";
            case 5:
                return "Equipo de sonido";
            default:
                return "Tipo no válido";
        }
    }

    private String obtenerNombreMarca() {
        switch (marca) {
            case 0:
                return "Samsung";
            case 1:
                return "LG";
            case 2:
                return "AOC";
            case 3:
                return "Thomas";
            case 4:
                return "Sony";
            case 5:
                return "Panasonic";
            case 6:
                return "Oster";
            case 7:
                return "Philips";
            default:
                return "Marca no válida";
        }
    }

	
}

