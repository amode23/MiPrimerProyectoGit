package personas;


public class Persona {

	protected String nombre;
	protected int edad;
	
	
	public Persona() {
		nombre = "An�nimo";
		edad = 18;
	}
	

	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String toString(){
	
		return "Persona[Nombre=" + nombre + ", Edad=" edad + "]";

	}

}
