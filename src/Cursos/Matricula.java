package Cursos;

public class Matricula {
    //Atributos
    private Estudiante estudiante;
    private Curso curso;
    private Docente docente;
    private Double nota = null;


    //Constructor
    public Matricula(Estudiante estudiante,Curso curso,Docente docente) {
        this.estudiante = estudiante;
        this.curso = curso;
        this.docente = docente;
    }

    //Métodos
    public void mostrarInformacion(){
            System.out.println(" ");
            System.out.println("Estudiante: " + estudiante.getNombre() +" Edad: " + estudiante.getEdad() + " Cédula: " + estudiante.getCedula());
            System.out.println("Curso: "+ curso.getNombreCurso() +" Paralelo: "+curso.getParalelo()+" Duración: "+curso.getDuracionMeses()+" meses " + " Precio "+curso.getPrecio());
            System.out.println("Docente: " + docente.getNombre()+" Edad: "+docente.getEdad()+" \n");
    }

    public void registrarEvaluacion(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
            System.out.println("Evaluación registrada con nota: " + nota+"\n");
        } else {
            System.out.println("Nota inválida. Debe estar entre 0 y 10.\n");
        }
    }

    public void mostrarDetalle() {
        if (nota == null) {
            System.out.println("El estudiante aún no tiene una nota registrada.\n");
        } else {
            System.out.println("Nota final del estudiante: " + nota);
            if (nota >= 6) {
                System.out.println("Resultado: Aprobado \n");

                if (curso instanceof CursoCertificado) {
                    CursoCertificado cc = (CursoCertificado) curso;
                    if (cc.getCertificado()) {
                        System.out.println("Certificado: Emitido \n");
                    } else {
                        System.out.println("Certificado: No disponible \n");
                    }
                }
            } else {
                System.out.println("Resultado: Reprobado \n");
                System.out.println("Certificado: No emitido\n");
            }
        }
    }

    public void inscribirEstudiante() {
        System.out.println("Estudiante " + estudiante.getNombre() + " ha sido inscrito en el curso " + curso.getNombreCurso());
    }

}
