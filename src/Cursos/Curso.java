package Cursos;

public class Curso {
    //Atributos
    private String nombreCurso;
    private String paralelo;
    private int duracionMeses;
    private double precio;


    //Constructor
    public Curso(String nombreCurso, String paralelo, int duracionMeses, double precio) {
        this.nombreCurso = nombreCurso;
        this.paralelo = paralelo;
        this.duracionMeses = duracionMeses;
        this.precio = precio;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public int getDuracionMeses() {
        return duracionMeses;
    }

    public void setDuracionMeses(int duracionMeses) {
        this.duracionMeses = duracionMeses;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Metodo
    public void mostrarResumen() {
        System.out.println("Nombre: " + nombreCurso);
        System.out.println("Paralelo: " + paralelo);
        System.out.println("Duracion: " + duracionMeses);
        System.out.println("Precio: " + precio);
    }

    public boolean verificarDocenteAsignado() {
        return true;
    }

    public void registrarEstudiante() {
    }

}
