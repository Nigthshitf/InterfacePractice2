package org.fifthProblem;

public class Estudiante {


    public void inscripcionYCompletarCursos(String tipoCurso, CursoPdf cursoPdf, CursoExamen cursoExamen, CursoVideo cursoVideo) {
        Curso cursoSeleccionado = null;

        switch (tipoCurso.toLowerCase().trim()) {
            case "curso examen":
                cursoSeleccionado = cursoExamen;
                break;
            case "curso video":
                cursoSeleccionado = cursoVideo;
                break;
            case "curso pdf":
                cursoSeleccionado = cursoPdf;
                break;
            default:
                System.out.println("No tenemos más cursos disponibles");
                return;
        }
        cursoSeleccionado.iniciar();
        System.out.println("Iniciando curso: " + tipoCurso);
        System.out.println("------------------------");

        cursoSeleccionado.completar();
        System.out.println("Completando curso: " + tipoCurso);
    }
}
