package monolitico.com.domain;

public class Curso {
	private int id_curso;
	private int nivel;
	private char letra;
	
	public Curso() {
		
	}
	
	public Curso(int id_curso, int nivel, char letra) {
		super();
		this.id_curso = id_curso;
		this.nivel = nivel;
		this.letra = letra;
	}

	public int getId_curso() {
		return id_curso;
	}

	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}
	
}
