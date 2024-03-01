package monolitico.com.domain;

public class Alumno {
	private int id_alumnos;
	private String nombre;
	private String apellido;
	private int dni;
	private int curso_id;
	
	
	public Alumno() {
		
	}
	
	public Alumno(int id_alumnos, String nombre, String apellido, int dni, int curso_id) {
		super();
		this.id_alumnos = id_alumnos;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.curso_id = curso_id;
	}

	public int getId_alumnos() {
		return id_alumnos;
	}
	
	public void setId_alumnos(int id_alumnos) {
		this.id_alumnos = id_alumnos;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getDni() {
		return dni;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getCurso_id() {
		return curso_id;
	}

	public void setCurso_id(int curso_id) {
		this.curso_id = curso_id;
	}
	
	
}
