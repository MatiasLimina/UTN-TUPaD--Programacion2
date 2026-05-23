package Ejercicio_03;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        setNombre(nombre);
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public Universidad() {
        this("Universidad Nacional");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            System.out.println("El nombre no puede estar vacio");
            this.nombre = "Sin nombre";
        } else {
            this.nombre = nombre;
        }
    }

    public void agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)) {
            profesores.add(p);
        }
    }

    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
        }
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        
        if (c != null && p != null) {
            c.setProfesor(p);
            System.out.println("Profesor asignado correctamente al curso " + c.getNombre());
        } else {
            System.out.println("No se pudo asignar. Verifique el código del curso o el ID del profesor.");
        }
    }

    public void listarProfesores() {
        System.out.println("--- Lista de Profesores y sus Cursos ---");
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
            return;
        }
        for (Profesor p : profesores) {
            System.out.println(p.getId() + " - " + p.getNombre() + " (" + p.getEspecialidad() + ")");
            if (p.getCursos().isEmpty()) {
                System.out.println("  -> Sin cursos asignados");
            } else {
                for (Curso c : p.getCursos()) {
                    System.out.println("  -> Curso: " + c.getCodigo() + " - " + c.getNombre());
                }
            }
        }
    }

    public void listarCursos() {
        System.out.println("--- Lista de Cursos ---");
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos registrados.");
            return;
        }
        for (Curso c : cursos) {
            System.out.print(c.getCodigo() + " - " + c.getNombre() + " | Profesor: ");
            if (c.getProfesor() != null) {
                System.out.println(c.getProfesor().getNombre());
            } else {
                System.out.println("Sin asignar");
            }
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            c.setProfesor(null); // Rompe la relación con el profesor
            cursos.remove(c);
            System.out.println("Curso " + c.getNombre() + " eliminado correctamente.");
        } else {
            System.out.println("Curso no encontrado.");
        }
    }

    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            // Dejar null los cursos que dictaba.
            // Iteramos sobre una copia de la lista de cursos para evitar ConcurrentModificationException
            List<Curso> cursosDelProfesor = new ArrayList<>(p.getCursos());
            for (Curso c : cursosDelProfesor) {
                c.setProfesor(null);
            }
            profesores.remove(p);
            System.out.println("Profesor " + p.getNombre() + " eliminado correctamente.");
        } else {
            System.out.println("Profesor no encontrado.");
        }
    }
    
    public void mostrarReporteCursosPorProfesor() {
        System.out.println("--- Reporte: Cantidad de Cursos por Profesor ---");
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
            return;
        }
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " curso(s)");
        }
    }
}