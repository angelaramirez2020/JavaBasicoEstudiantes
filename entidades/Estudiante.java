package entidades;

import java.util.ArrayList;

public class Estudiante{
	private int edad;
	private String nombre;
	private int grado;
	ArrayList<Float> listaCalificaciones = new ArrayList<>();
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setGrado(int grado) {
		this.grado = grado;
	}
	
	public int getGrado() {
		return this.grado;
	}
	
	public void setlistaCalificaciones (ArrayList<Float> listaCalificaciones){
		this.listaCalificaciones = listaCalificaciones;
	}
	
	public ArrayList<Float>  getlistaCalificaciones(){
		return this.listaCalificaciones;
	}
}