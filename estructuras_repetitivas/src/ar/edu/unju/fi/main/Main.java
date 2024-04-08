package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {

	
	static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {

		Alumno alumno = new Alumno();
		System.out.println("ingrese legajo");
		alumno.setLegajo(scanner.nextInt());
		System.out.println("ingrese nombre");
		alumno.setNombre(scanner.next());
		System.out.println("ingrese apellido");
		alumno.setApellido(scanner.next());
		
		
		System.out.println(alumno.toString());
		
		int numMaterias = 1;
		
		while (numMaterias <= 4) {
			System.out.println("ingrese el codigo de materia " + numMaterias);
			String codigoMateria = scanner.next();
			System.out.println("ingrese el nombre de materia " + numMaterias);
			String nombreMateria = scanner.next();
			
			Materia materia = new Materia(codigoMateria, nombreMateria);
			
			System.out.println("ingrese codigo registro nota");
			String codigoRegistro = scanner.next();
			System.out.println("ingrese nota final");
			Float notaFinal = scanner.nextFloat();
			
			RegistroNota registro = new RegistroNota(codigoRegistro, alumno, materia, notaFinal);
			
			System.out.println(registro.toString());
			numMaterias++;
		}
		
	}

	
	
}
