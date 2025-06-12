package Cursos;

public class Estudiante {
    //Atributos
    private String nombre;
    private int edad;
    private String cedula;

    //Constructor
    public Estudiante(String nombre, int edad, String cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
