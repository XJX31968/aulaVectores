package aulaVector;

import java.util.Arrays;
import java.util.Scanner;

public class Alumno {

	private Start start;
	private String[] alumnos;
	private String[] nombre;
	private Asignaturas asignaturas;
	private Scanner teclado;
	private String[] apellido;
	private int[] teléfono;
	
	
	public Alumno() {
		
		this.alumnos= new String alumnos[alumnosMatriculados];
		this.nombre
		
		rellenarAlumnos();
		
		
	}
	
	
	


	
	

	
	public void rellenarAlumnos() {
		
		teclado= new Scanner(System.in);
		alumnos= new String [1];
		teléfono= new int[1];
		apellido= new String[1];
		nombre= new String[1];
		for(int i=0;i<alumnos.length;i++) {
			 System.out.print("Ingrese el nombre del alumno con código "+i+"");
			 nombre[i]=teclado.next();
			 System.out.print("Ingrese el apellido del alumno con código "+i+"");
			 apellido[i]=teclado.next();
			 System.out.println("Ingrese el teléfono del alumno con código "+i+"");
			 teléfono[i]=teclado.nextInt();
		}
	
	
	}
	
	
	
	
	
	
	
	
}
