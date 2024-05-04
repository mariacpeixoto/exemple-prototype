// CourseRegistry.java
import java.util.HashMap;
import java.util.Map;

//Classe que mant�m um registro de prot�tipos de cursos
public class CourseRegistry {
	private Map<String, Course> courses = new HashMap<>();

    public CourseRegistry() {
        initialize();
    }

    private void initialize() {
        // Exemplo de inicializa��o com alguns cursos padr�o
        Course javaCourse = new Course("Curso Java", "Jo�o de Melo");
        Course nodeCourse = new Course("Curso Node", "Jane Smith");
        courses.put("java", javaCourse);
        courses.put("node", nodeCourse);
    }

    public Course getCourse(String type) {
        Course course = courses.get(type);
        if (course != null) {
            return course.clone();
        } else {
            throw new IllegalArgumentException("Curso '" + type + "' n�o encontrado.");
        }
    }

}
