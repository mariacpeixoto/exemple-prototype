// Interface Prototype
interface CloneableCourse {
    CloneableCourse clone();
}

//Classe Curso que implementa a interface CloneableCourse
public class Course implements CloneableCourse {
	private String nome;
    private String professor;

    public Course(String name, String instructor) {
        this.nome = nome;
        this.professor = professor;
    }

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}


	@Override
    public Course clone() {
        return new Course(this.nome, this.professor);
    }

    @Override
    public String toString() {
        return "Curso: " + nome + ", Professor: " + professor;
    }
}
