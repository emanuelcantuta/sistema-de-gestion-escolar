package monolitico.com.domain;

public class Profesor {

	private int id_profesor;
	private String nombre;
	private String apellido;
	private int dni;
	private int materia_id;
	
	public Profesor(){
		
	}

	public Profesor(int id_profesor, String nombre, String apellido, int dni, int materia_id) {
		super();
		this.id_profesor = id_profesor;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.materia_id = materia_id;
	}

	public int getId_profesor() {
		return id_profesor;
	}

	public void setId_profesor(
			int id_profesor) {
		this.id_profesor = id_profesor;
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

	public int getMateria_id() {
		return materia_id;
	}

	public void setMateria_id(int materia_id) {

		this.materia_id = materia_id;
	}
	
	
}
