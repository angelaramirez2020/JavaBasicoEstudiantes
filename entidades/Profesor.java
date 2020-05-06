package entidades;

public class Profesor{
	private String nombre;
	private int documento;
	private String nombreMateria;
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	
	public int getDocumento() {
		return this.documento;
	}
	
	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	
	public String getNombreMateria() {
		return this.nombreMateria;
	}
		
}