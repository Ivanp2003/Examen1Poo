package Main;

import Cursos.*;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Andres", 21, "1680004990");
        CursoCertificado curso = new CursoCertificado("POO", "A", 6, 60.00, true);
        Docente docente = new Docente("Yadira", 40);

        Matricula matricula = new Matricula(estudiante, curso, docente);

        matricula.inscribirEstudiante();
        matricula.mostrarInformacion();
        matricula.registrarEvaluacion(7);
        matricula.mostrarDetalle();


        Estudiante estudiante1 = new Estudiante("Ivan", 20, "1681234990");
        CursoRegular cursoRegular = new CursoRegular("Analisis de datos","B",6,100.00);
        Docente docente1 = new Docente("Juan",45);

        Matricula matricula1 = new Matricula(estudiante1, cursoRegular, docente1);

        matricula1.inscribirEstudiante();
        matricula1.mostrarInformacion();
        matricula1.mostrarDetalle();


        Estudiante estudiante2 = new Estudiante("Andres Panchi", 22, "1680004990");
        CursoRegular cursoRegular1 = new CursoRegular("Gestion de Proyectos","C",10,150.75);
        Docente docente2 = new Docente("Ivonne",30);

        Matricula matricula2 = new Matricula(estudiante2, cursoRegular1, docente2);
        matricula2.inscribirEstudiante();
        matricula2.mostrarInformacion();
    }
}
