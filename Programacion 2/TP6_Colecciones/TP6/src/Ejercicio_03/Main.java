package Ejercicio_03;

public class Main {
    public static void main(String[] args) {
        Universidad universidad = new Universidad("UTN");

        // 1. Crear al menos 3 profesores y 5 cursos.
        Profesor prof1 = new Profesor("Dr. Alberto Rossi", "Matemáticas");
        Profesor prof2 = new Profesor("Lic. Elena Paz", "Programación");
        Profesor prof3 = new Profesor("Ing. Carlos Méndez", "Física");

        // Creamos los cursos inicialmente sin profesor (null)
        Curso c1 = new Curso("Álgebra Lineal", null);
        Curso c2 = new Curso("Java Avanzado", null);
        Curso c3 = new Curso("Física I", null);
        Curso c4 = new Curso("Cálculo I", null);
        Curso c5 = new Curso("Estructura de Datos", null);

        // 2. Agregar profesores y cursos a la universidad.
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);

        universidad.agregarCurso(c1);
        universidad.agregarCurso(c2);
        universidad.agregarCurso(c3);
        universidad.agregarCurso(c4);
        universidad.agregarCurso(c5);

        // 3. Asignar profesores a cursos usando asignarProfesorACurso(...).
        System.out.println("=== Asignando Profesores a Cursos ===");
        universidad.asignarProfesorACurso(c1.getCodigo(), prof1.getId());
        universidad.asignarProfesorACurso(c4.getCodigo(), prof1.getId()); // Rossi tiene 2 cursos
        universidad.asignarProfesorACurso(c2.getCodigo(), prof2.getId());
        universidad.asignarProfesorACurso(c5.getCodigo(), prof2.getId()); // Paz tiene 2 cursos
        universidad.asignarProfesorACurso(c3.getCodigo(), prof3.getId()); // Méndez tiene 1 curso
        System.out.println();

        // 4. Listar cursos con su profesor y profesores con sus cursos.
        System.out.println("=== Listado Inicial ===");
        universidad.listarCursos();
        System.out.println();
        universidad.listarProfesores();
        System.out.println();

        // 5. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
        System.out.println("=== Cambiando el profesor de Estructura de Datos (de Elena a Carlos) ===");
        universidad.asignarProfesorACurso(c5.getCodigo(), prof3.getId());
        System.out.println();
        
        System.out.println("Verificando sincronización (Elena debería tener 1 curso, Carlos 2):");
        universidad.mostrarReporteCursosPorProfesor();
        System.out.println();

        // 6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
        System.out.println("=== Removiendo el curso de Física I ===");
        universidad.eliminarCurso(c3.getCodigo());
        System.out.println();
        
        System.out.println("Verificando lista del profesor Carlos Méndez:");
        prof3.mostrarInfo();
        System.out.println();

        // 7. Remover un profesor y dejar profesor = null en sus cursos.
        System.out.println("=== Removiendo a la profesora Elena Paz ===");
        universidad.eliminarProfesor(prof2.getId());
        System.out.println();
        
        System.out.println("Verificando el curso de Java Avanzado (debe estar sin profesor):");
        universidad.listarCursos();
        System.out.println();

        // 8. Mostrar un reporte: cantidad de cursos por profesor.
        System.out.println("=== Reporte Final ===");
        universidad.mostrarReporteCursosPorProfesor();
    }
}