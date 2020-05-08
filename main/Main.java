package main;

import entidades.Estudiante;
import entidades.Profesor;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	static ArrayList<Estudiante> listaEstudiantes;
	static ArrayList<Profesor> listaProfesores;
	static int posicionEstudiante;
	static int posicionProfesor;
	static Scanner leer;
	static ArrayList<Float> listaCalificaciones;
	static final int CANTIDAD_NOTAS = 3;
	

	public static void main(String[] args) {	
		listaEstudiantes = new ArrayList<>();
		listaProfesores = new ArrayList<>();
		posicionEstudiante = 1;
		posicionProfesor = 1;
		leer = new Scanner(System.in);
		Estudiante estudianteAux;
		Profesor profesorAux;
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
					System.out.println("Ingrese el nombre del acudiente para el estudiante " + posicionEstudiante);
					estudianteAux.setAcudiente(leer.nextLine());
					estudianteAux.setListaCalificaciones(insertarNotas());
					addEstudiante(estudianteAux);
					break;
				case 2:
					imprimirEstudiantes();
					break;
				case 3:
					profesorAux = new Profesor();
					System.out.println("Ingrese el nombre del profesor " + posicionProfesor);
					profesorAux.setNombre(leer.nextLine());
					System.out.println("Ingrese el número del documento del profesor " + posicionProfesor);
					profesorAux.setDocumento(leer.nextInt());
					leer.nextLine();
					System.out.println("Ingrese la materia a cargo del profesor " + posicionProfesor);
					profesorAux.setNombreMateria(leer.nextLine());
					addProfesor(profesorAux);
					break;
				case 4:
					imprimirProfesores();
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
	
	public static void addProfesor(Profesor profesor){
		listaProfesores.add(profesor);
		posicionProfesor = posicionProfesor + 1;
	}
	
	public static void imprimirEstudiantes(){
		float promedio;
		for(Estudiante estudianteIterador : listaEstudiantes) {
			System.out.println(estudianteIterador.getNombre() + " tiene " + estudianteIterador.getEdad() + " anhos");
			promedio = 0.0F;
			for(Float nota : estudianteIterador.getListaCalificaciones()){
				promedio = promedio + nota;
			}
			promedio = promedio / CANTIDAD_NOTAS;
			System.out.println("El estudiante tiene un promedio de: " + promedio);
			System.out.println("El acudiente del estudiante es: " + estudianteIterador.getAcudiente());
		}
	}
	
	public static void imprimirProfesores(){
		for(Profesor profesorIngresado : listaProfesores){
			System.out.println("Documento Docente:" + profesorIngresado.getDocumento() + " Nombre Docente:" + profesorIngresado.getNombre() + " Asignatura: " + profesorIngresado.getNombreMateria());
		}
	}
	
	public static int formularioOpciones(){
		System.out.println("Opciones");
		System.out.println("Ingrese 0 para salir");
		System.out.println("Ingrese 1 para crear un estudiante");	
		System.out.println("Ingrese 2 para mostrar todos los estudiantes");
		System.out.println("Ingrese 3 para crear el profesor");
		System.out.println("Ingrese 4 para imprimir Profesores");
		return leer.nextInt();
	}
	
	public static ArrayList<Float> insertarNotas(){
		listaCalificaciones = new ArrayList<>();
		for(int i = 0; i < CANTIDAD_NOTAS; i++){
			System.out.println("Ingrese la nota número: " + (i + 1));
			listaCalificaciones.add(leer.nextFloat());
		} 
		return listaCalificaciones;	
	}
}