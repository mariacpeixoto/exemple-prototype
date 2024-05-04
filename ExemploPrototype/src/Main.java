
public class Main {
	public static void main(String[] args) {
        // Criando um registro de cursos
        CourseRegistry registry = new CourseRegistry();

        // Clonando um curso Java
        Course javaCourseClone = registry.getCourse("java");
        javaCourseClone.setNome("Curso de Java Avançado");

        // Clonando um curso Python
        Course nodeCourseClone = registry.getCourse("node");
        nodeCourseClone.setProfessor("João da Silva");

        // Exibindo os cursos originais e seus clones
        System.out.println("Curso Java Original: " + registry.getCourse("java"));
        System.out.println("Curso Java Clone: " + javaCourseClone);
        System.out.println("Curso Node Original: " + registry.getCourse("node"));
        System.out.println("Curso Node Clone: " + nodeCourseClone);
    }
}
