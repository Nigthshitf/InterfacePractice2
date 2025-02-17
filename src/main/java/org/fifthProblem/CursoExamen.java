package org.fifthProblem;

public class CursoExamen implements Curso, Evaluable{
    @Override
    public void iniciar() {

    }

    @Override
    public void completar() {

    }

    @Override
    public void calificar(int puntaje) {
        System.out.println("Su calificacion en el curso es de " + puntaje);
    }
}
