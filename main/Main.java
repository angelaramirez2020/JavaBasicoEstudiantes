package main;

import entidades.Estudiante;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	static ArrayList<Estudiante> listaEstudiantes;
	static int posicionEstudiante;
	static Scanner leer;

	public static void main(String[] args) {	
		listaEstudiantes = new ArrayList<>();
		posicionEstudiante = 1;
		leer = new Scanner(System.in);
		Estudiante estudianteAux;
		int respuesta = 0;
		do {
			respuesta = formularioOpciones();
			leer.nextLine();
			switch(respuesta) {
				case 1:
					estudianteAux = new Estudiante();
					System.out.println("Ingrese el nombre del estudiante para el estudiante " + posicionEstudiante);
					estudianteAux.setNombre(leer.nextLine());
					System.out.println("Ingrese la edad del estudiante " + posicionEstudiante);
					estudianteAux.setEdad(leer.nextInt());
					leer.nextLine();
					addEstudiante(estudianteAux);
					break;
				case 2:
					imprimirEstudiantes();
					break;
				default:
					break;
			}
		} while(respuesta != 0);
	}
	
	public static void addEstudiante(Estudiante estudiante){
		listaEstudiantes.add(estudiante);
		posicionEstudiante = posicionEstudiante + 1;
	}
	
	public static void imprimirEstudiantes(){
		for(Estudiante estudianteIterador : listaEstudiantes) {
			System.out.println(estudianteIterador.getNombre() + " tiene " + estudianteIterador.getEdad() + " anhos");
		}
	}
	
	public static int formularioOpciones(){
		System.out.println("Opciones");
		System.out.println("Ingrese 0 para salir");
		System.out.println("Ingrese 1 para crear un estudiante");
		System.out.println("Ingrese 2 para mostrar todos los estudiantes");
		return leer.nextInt();
	}
}