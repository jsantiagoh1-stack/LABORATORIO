package Laboratorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<String>estudiantes = new ArrayList<>();
	static List<Double>calificaciones = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		 int opcion = 0;

	        while (opcion != 5) {

	            mostrarMenu();
	            opcion = leerOpcion();

	            if (opcion == 1) {
	                agregarEstudiante();
	            } 
	            else if (opcion == 2) {
	                mostrarEstudiantes();
	            } 
	            else if (opcion == 3) {
	                calcularPromedio();
	            } 
	            else if (opcion == 4) {
	                mostrarMejorEstudiante();
	            } 
	            else if (opcion == 5) {
	                System.out.println("Saliendo...");
	            } 
	            else {
	                System.out.println("Opción no válida.");
	            }
	        }

	        scanner.close();
	    }

	    // Mostrar menú
	    public static void mostrarMenu() {
	        System.out.println("\n1. Agregar estudiante");
	        System.out.println("2. Mostrar estudiantes");
	        System.out.println("3. Calcular promedio");
	        System.out.println("4. Mostrar mejor estudiante");
	        System.out.println("5. Salir");
	        System.out.print("Opción: ");
	    }

	    // Leer opción con validación 
	    public static int leerOpcion() {
	        int numero = 0;
	        try {
	            numero = Integer.parseInt(scanner.nextLine());
	        } catch (Exception e) {
	            System.out.println("Debe ingresar un número.");
	        }
	        return numero;
	    }

	    // Estudiante nuevo
	    public static void agregarEstudiante() {

	        System.out.print("Nombre: ");
	        String nombre = scanner.nextLine();

	        System.out.print("Calificación: ");
	        try {
	            double nota = Double.parseDouble(scanner.nextLine());

	            if (nota >= 0 && nota <= 100) {
	                estudiantes.add(nombre);
	                calificaciones.add(nota);
	                System.out.println("Estudiante agregado.");
	            } else {
	                System.out.println("La nota debe estar entre 0 y 100.");
	            }

	        } catch (Exception e) {
	            System.out.println("Debe ingresar un número válido.");
	        }
	    }

	    // Mostrar estudiantes
	    public static void mostrarEstudiantes() {

	        if (estudiantes.isEmpty()) {
	            System.out.println("No hay estudiantes.");
	        } else {
	            for (int i = 0; i < estudiantes.size(); i++) {
	                System.out.println(estudiantes.get(i) +
	                        " - " + calificaciones.get(i));
	            }
	        }
	    }

	    // Calcular promedio
	    public static void calcularPromedio() {

	        if (calificaciones.isEmpty()) {
	            System.out.println("No hay calificaciones.");
	        } else {
	            double suma = 0;

	            for (double nota : calificaciones) {
	                suma += nota;
	            }

	            double promedio = suma / calificaciones.size();
	            System.out.println("Promedio: " + promedio);
	        }
	    }

	    // Mostrar el mejor estudiante
	    public static void mostrarMejorEstudiante() {

	        if (calificaciones.isEmpty()) {
	            System.out.println("No hay calificaciones.");
	        } else {

	            double mayor = calificaciones.get(0);
	            String nombreMayor = estudiantes.get(0);

	            for (int i = 1; i < calificaciones.size(); i++) {
	                if (calificaciones.get(i) > mayor) {
	                    mayor = calificaciones.get(i);
	                    nombreMayor = estudiantes.get(i);
	                }
	            }

	            System.out.println("Mejor estudiante: " + nombreMayor +
	                    " con " + mayor);
	        }
	    }
	}