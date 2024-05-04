// CourseRegistry.java
import java.util.HashMap;
import java.util.Map;

//Classe que mantém um registro de protótipos de cursos
public class CourseRegistry {
	private Map<String, Course> courses = new HashMap<>();

    public CourseRegistry() {
        initialize();
    }

    private void initialize() {
        // Exemplo de inicialização com alguns cursos padrão
        Course javaCourse = new Course("Curso Java", "João de Melo");
        Course nodeCourse = new Course("Curso Node", "Jane Smith");
        courses.put("java", javaCourse);
        courses.put("node", nodeCourse);
    }

    public Course getCourse(String type) {
        Course course = courses.get(type);
        if (course != null) {
            return course.clone();
        } else {
            throw new IllegalArgumentException("Curso '" + type + "' não encontrado.");
        }
    }

}
