package aulaVector;

public class Alumno {

	
	private int[] alumnos;
	private String nombre;
	private int[] calificaciones; 
	
	
	
	public Alumno(String nombre) {
		
		rellenarAlumnos();
		
		
		
	}
	
	
	public void rellenarAlumnos() {
		
		alumnos = new int[5];
		for (int i = 0; i <alumnos.length; i++) {
		alumnos[i]=this.alumnos[i];
			
	}
	
	}
	
}
