package Cursos;

public class CursoRegular extends Curso {

    //Constructor
    public CursoRegular(String nombreCurso,String paralelo, int duracionMeses, double precio) {
        super(nombreCurso,paralelo,duracionMeses,precio);
    }

    //Metodo

    @Override
    public void mostrarResumen(){
        System.out.println("Curso Regular");
        System.out.println("Nombre Curso: "+getNombreCurso());
        System.out.println("Paralelo Curso: "+getParalelo());
        System.out.println("Duracion Meses: "+getDuracionMeses());
        System.out.println("Precio: "+getPrecio());
    }


}


